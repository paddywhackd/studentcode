package com.techelevator;
import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {


    @Test
    public void if_3_return_copies_of_the_front() {

        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        //Act
        String actual = frontTimes.generateString("welcometothunderdome", 3);
        //Assert
        Assert.assertEquals("welwelwel", actual);
    }
    @Test
    public void if_less_than_3_return_first_2_twice() {
    //Arrange
    FrontTimes frontTimes = new FrontTimes();
    //Act
    String actual = frontTimes.generateString("we", 2);
    //Assert
         Assert.assertEquals("wewe", actual);
}
    @Test
    public void if_more_than_3_return_amount_x_times() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        //Act
        String actual = frontTimes.generateString("welcometothestagebrandy", 4);
        //Assert
        Assert.assertEquals("welwelwelwel", actual);
    }




}
