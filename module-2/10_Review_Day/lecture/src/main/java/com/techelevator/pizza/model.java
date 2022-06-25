package com.techelevator.pizza;

import java.math.BigDecimal;

public class model {

    private int pizzaID;
    private int saleID;
    private String sizeID;
    private String crust;
    private String sauce;
    private BigDecimal price;
    private String additionalInstructions;

    public int getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(int pizzaID) {
        this.pizzaID = pizzaID;
    }

    public int getSaleID() {
        return saleID;
    }
}
