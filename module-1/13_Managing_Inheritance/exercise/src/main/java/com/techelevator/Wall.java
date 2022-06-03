package com.techelevator;

public abstract class Wall {
    //variables
  private String name;
  private String color;

    //Constructor
    public Wall (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

public abstract int getArea();
}
