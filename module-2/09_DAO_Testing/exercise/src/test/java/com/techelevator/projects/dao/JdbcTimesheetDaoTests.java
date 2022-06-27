package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;


public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private JdbcTimesheetDao sut;
    private Timesheet testTimesheet = new Timesheet(5, 2, 1, LocalDate.now(), 2.00, true, "timesheet returns correct values");

    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheetActual = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheetActual);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheetNUll = sut.getTimesheet(5);
        Assert.assertNull("Didn't get NUll when ID not found", timesheetNUll);

    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> expected = new ArrayList<>();
        expected.add(TIMESHEET_1);
        expected.add(TIMESHEET_2);

        List<Timesheet> actual = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals("List differs", expected.size(), actual.size());
        Assert.assertEquals("List differs", expected.size(), actual.size());
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> expected = new ArrayList<>();
        expected.add(TIMESHEET_1);
        expected.add(TIMESHEET_4);

        List<Timesheet> actual = sut.getTimesheetsByEmployeeId(2);
        Assert.assertEquals("List differs", expected.size(), actual.size());
        Assert.assertEquals("List Differs", expected.size(), actual.size());
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
//        Timesheet expected = new Timesheet(1, 1, 1, LocalDate.now(), 1, true, "Timesheet 1");
//
//        Timesheet actual = sut.createTimesheet(expected);
//
//        Assert.assertEquals("Didn't get expected timesheet id", 1, actual.getTimesheetId());
//        expected.setTimesheetId(1);
//        assertTimesheetsMatch(expected, actual);
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrieveTimesheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrieveTimesheet);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrieveTimesheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrieveTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = sut.getTimesheet(1);

        timesheetToUpdate.setTimesheetId(1);
        timesheetToUpdate.setBillable(true);

        sut.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedTimesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(timesheetToUpdate, retrievedTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(4);

        Timesheet retrievedTimesheet = sut.getTimesheet(4);
        Assert.assertNull(retrievedTimesheet);

        List<Timesheet> cities = sut.getTimesheetsByEmployeeId(2);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double total = sut.getBillableHours(2, 2);
        double expected = 0;

        Assert.assertEquals(expected, total, 0.001);


    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }


}
