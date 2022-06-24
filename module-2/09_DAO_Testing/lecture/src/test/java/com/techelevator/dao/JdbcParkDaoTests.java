package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        //Arrange handled via spring black magic


    //Act
        Park park1Actual = sut.getPark(1);

      //Assert
      Assert.assertEquals("Park IDs Differ", PARK_1.getParkId(), park1Actual.getParkId());
        assertParksMatch(PARK_1, park1Actual);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        //Arrange - already done
        //Act
        Park parkActual =  sut.getPark(0);

        //Assert
        Assert.assertNull("Didn't get null when ID not found", parkActual);


    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        //Arrange
        List<Park> expected = new ArrayList<>();
        expected.add(PARK_1);
        expected.add(PARK_3);
        //Act
        List<Park> actual = sut.getParksByState("AA");

        //Assert
        for

    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        Assert.fail();
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        Assert.fail();
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        Assert.fail();
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        Assert.fail();
    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        Assert.fail();
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals("Park IDs Differ", expected.getParkId(), actual.getParkId());
        Assert.assertEquals("Park Names Differ", expected.getParkName(), actual.getParkName());
        Assert.assertEquals("Dates established Differ", expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals("Areas Differ", expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals("Has campings differ", expected.getHasCamping(), actual.getHasCamping());
    }

}
