package com.techelevator;

public class Card {

    public final static String[] SUIT_NAMES = new String[] { "Nil", "Spades", "Diamonds", "Clubs", "Hearts" };
    public final static String[] RANK_NAMES = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King" };


    private int suit = 0;
    private int rank = 0;
    private boolean faceDown = true;

    public Card(int suit, int rank) {
        this(suit, rank, false);


    }

    public Card( int suit, int rank, boolean showFaceUp) {

        this.suit = suit;
        this.rank = rank;
        this.faceDown = !showFaceUp;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;

    }

    public boolean isFaceDown() {
        return faceDown;
    }


    public String cardOrientation() {
        return "The card is " + ((faceDown) ? "face down " : "face up");
    }

    public void setRank( int rank) {
        if (rank > 0 && rank <= 13) {
            this.rank = rank;
        }

    }

    public void flip() {
        this.faceDown = !faceDown;

    }

    public String toString() {
        return String.format("%s of %s", Card.RANK_NAMES[rank], Card.SUIT_NAMES(suit));
    }

}
