package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void return_true_if_positive_number_is_2_less_than_a_multiple_of_20() {
        //Arrange
        Less20 less20 = new Less20();
        //Act
        boolean actual = less20.isLessThanMultipleOf20(18);

        //Assert
        Assert.assertEquals(true, actual);
    }

    @Test
    public void return_true_if_positive_number_is_1_less_than_a_multiple_of_20() {
        //Arrange
        Less20 less20 = new Less20();
        //Act
        boolean actual = less20.isLessThanMultipleOf20(19);

        //Assert
        Assert.assertEquals(true, actual);

    }

    @Test
    public void return_false_if_number_is_multiple_of_20() {
        //Arrange
        Less20 less20 = new Less20();
        //Act
        boolean actual = less20.isLessThanMultipleOf20(20);

        //Assert
        Assert.assertEquals(false, actual);

    }
}
