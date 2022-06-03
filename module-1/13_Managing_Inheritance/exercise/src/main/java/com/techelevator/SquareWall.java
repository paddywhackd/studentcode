package com.techelevator;

public class SquareWall extends RectangleWall {

    private int length = 0;
    private int height = 0;
    private String name = "";
    private String color = "";
    private int sideLength = 0;

    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public int getArea() {
        return (sideLength * sideLength);
    }

    public String toString() {
        return getName() + " (" + sideLength + "x" + sideLength + ") " + "square";
    }
}