package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void return_yes_if_both_you_and_date_greater_than_7() {
        //arrange
        DateFashion dateFashion = new DateFashion();

        //act
        int actual = dateFashion.getATable(8, 8);
        //assert
        Assert.assertEquals(2, actual);
    }

    @Test
    public void return_no_table_if_either_score_less_7() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        //act
        int actual = dateFashion.getATable(5, 2);
        //assert
        Assert.assertEquals(0, actual);
    }

    @Test
    public void return_maybe_if_score_are_the_same() {
        //arrange
        DateFashion dateFashion = new DateFashion();
        //act
        int actual = dateFashion.getATable(5, 5);
        //assert
        Assert.assertEquals(1, actual);

    }
}
