package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NotStartTest {

    @Test
    public void return_string_omitting_first_char() {
        //arrange
        NonStart nonStart = new NonStart();
        //act
        String actual = NonStart.getPartialString("hello", "there");

        //assert
         Assert.assertEquals("ello" + "here", "ellohere" );


    }

}
