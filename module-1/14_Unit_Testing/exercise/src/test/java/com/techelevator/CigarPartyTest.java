package com.techelevator;
import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void returns_false_if_under_40_and_not_weekend() {
        //arrange
        CigarParty cigarParty = new CigarParty();
        //act
        boolean actual = cigarParty.haveParty(39, false);
        //assert
        Assert.assertEquals(false, actual);
    }
    @Test
    public void returns_true_if_between_40_and_60_not_weekend() {
        //arrange
        CigarParty cigarParty = new CigarParty();
        //act
        boolean actual = cigarParty.haveParty(50, false);
        //assert
        Assert.assertEquals(true, actual);

    }
    @Test
    public void returns_true_if_over_60_but_is_a_weekend() {
        //arrange
        CigarParty cigarParty = new CigarParty();
        //act
        boolean actual = cigarParty.haveParty(61, true);
        //assert
        Assert.assertEquals(true, actual);
    }

}
