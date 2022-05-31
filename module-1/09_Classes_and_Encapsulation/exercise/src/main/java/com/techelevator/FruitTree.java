package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree( String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public boolean pickFruit (int fruitRemoved) {
        if (piecesOfFruitLeft >= fruitRemoved) {
            piecesOfFruitLeft -= fruitRemoved;
            return true;
        } else {
            return false;
        }
    }

    public String getTypeOfFruit() {
        return typeOfFruit;

    }
    public int getPiecesOfFruitLeft () {
        return piecesOfFruitLeft;
    }
}
