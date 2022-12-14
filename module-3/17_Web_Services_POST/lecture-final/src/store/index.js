import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        boards: [],
        activeBoardId: null,
        boardCards: [],
        card: {
            title: '',
            description: '',
            status: '',
            comments: []
        }
    },
    mutations: {
        SET_BOARDS(state, data) {
            state.boards = data;
        },
        SET_ACTIVE_BOARD(state, boardId) {
            state.activeBoardId = boardId;
        },
        SET_BOARD_CARDS(state, data) {
            state.boardCards = data;
        },
        SET_CURRENT_CARD(state, data) {
            state.card = data;
        },
        DELETE_BOARD(state, boardIdToDelete) {
            state.boards = state.boards.filter((board) => {
                return board.id !== boardIdToDelete;
            });
        },
        UPDATE_BOARD(state, board) {
            const boardInStore = state.boards.find(b => b.id == board.id);
            boardInStore.title = board.title;
        }
    },
    actions: {
    },
    modules: {
    }
})
