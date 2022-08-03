<template>
  <div>
    <h1>{{ card.title }}</h1>
    <p>{{ card.description }}</p>
    <comments-list :comments="card.comments">
  </div>
</template>

<script>
import boardService from "@/services/BoardService";
import commentList from "@/services/CommentsList/";
export default {
  name: "card-detail",
  data() {
    return {
      card: {
        title: "",
        description: "",
        status: "",
        comments: [],
      },
    };
  },
  components: {
    CommentsList,
  
  created() {
    const boardID = this.$route.params.boardID;
    const cardID = this.$route.params.cardID;
    boardService.getCard(boardID, cardID).then((card) => (this.card = card));
  },
};
</script>
