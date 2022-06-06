package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void return_true_if_array_contains_no_1s_or_3s() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{0, 2, 4});

        //Assert
        Assert.assertEquals(true, actual);
    }
    @Test
    public void return_false_if_array_contains_1s_and_or_3s() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{1, 2, 3});

        //Assert
        Assert.assertEquals(false, actual);
    }
    @Test
    public void return_false_if_array_contains_1s_or_3s() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        boolean actual = lucky13.getLucky(new int[]{1, 2, 4});

        //Assert
        Assert.assertEquals(false, actual);
    }
}
