package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;


public class JdbcTimesheetDao implements TimesheetDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTimesheetDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Timesheet getTimesheet(int timesheetId) {
        Timesheet timesheet = null;
        String sql = "SELECT timesheet_id, employee_id, project_id, date_worked, hours_worked, billable, description " +
                     "FROM timesheet " +
                     "WHERE timesheet_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, timesheetId);
        while (results.next()) {
            timesheet = mapRowToTimesheet(results);
        }
        return timesheet;
    }

    @Override
    public List<Timesheet> getTimesheetsByEmployeeId(int employeeId) {
        List<Timesheet> timesheets = new ArrayList<>();
        String sql = "SELECT timesheet_id, employee_id, project_id, date_worked, hours_worked, billable, description " +
                     "FROM timesheet " +
                     "WHERE employee_id = ? " +
                     "ORDER BY timesheet_id;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, employeeId);
        while (results.next()) {
            Timesheet timesheet = mapRowToTimesheet(results);
            timesheets.add(timesheet);
        }
        return timesheets;
    }

    @Override
    public List<Timesheet> getTimesheetsByProjectId(int projectId) {
        List<Timesheet> timesheets = new ArrayList<>();
        String sql = "SELECT timesheet_id, employee_id, project_id, date_worked, hours_worked, billable, description " +
                     "FROM timesheet " +
                     "WHERE project_id = ? " +
                     "ORDER BY timesheet_id;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
        while (results.next()) {
            Timesheet timesheet = mapRowToTimesheet(results);
            timesheets.add(timesheet);
        }
        return timesheets;
    }

    @Override
    public Timesheet createTimesheet(Timesheet newTimesheet) {
        String sql = "INSERT INTO timesheet (employee_id, project_id, date_worked, hours_worked, billable, description) " +
                     "VALUES (?, ?, ?, ?, ?, ?) RETURNING timesheet_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, newTimesheet.getEmployeeId(), newTimesheet.getProjectId(),
                     newTimesheet.getDateWorked(), newTimesheet.getHoursWorked(), newTimesheet.isBillable(),
                     newTimesheet.getDescription());
        return getTimesheet(newId);
    }

    @Override
    public void updateTimesheet(Timesheet updatedTimesheet) {
        String sql = "UPDATE timesheet " +
                     "SET employee_id = ?, project_id = ?, date_worked = ?, hours_worked = ?, description = ? " +
                     "WHERE timesheet_id = ?";
        jdbcTemplate.update(sql, updatedTimesheet.getEmployeeId(), updatedTimesheet.getProjectId(),
                updatedTimesheet.getDateWorked(), updatedTimesheet.getHoursWorked(), updatedTimesheet.getDescription(),
                updatedTimesheet.getTimesheetId());
    }

    @Override
    public void deleteTimesheet(int timesheetId) {
        String sql = "DELETE FROM timesheet WHERE timesheet_id = ?";
        jdbcTemplate.update(sql, timesheetId);
    }

    @Override
    public double getBillableHours(int employeeId, int projectId) {
        double billableHours = 0;
        String sql = "SELECT SUM(hours_worked) AS billable_hours " +
                     "FROM timesheet " +
                     "WHERE employee_id = ? AND project_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, employeeId, projectId);
        if (results.next()) {
            billableHours = results.getDouble("billable_hours");
        }
        return billableHours;
    }

    private Timesheet mapRowToTimesheet(SqlRowSet results) {
        Timesheet timesheet = new Timesheet();
        timesheet.setTimesheetId(results.getInt("timesheet_id"));
        timesheet.setEmployeeId(results.getInt("employee_id"));
        timesheet.setProjectId(results.getInt("project_id"));
        timesheet.setDateWorked(results.getDate("date_worked").toLocalDate());
        timesheet.setHoursWorked(results.getDouble("hours_worked"));
        timesheet.setBillable(results.getBoolean("billable"));
        timesheet.setDescription(results.getString("description"));
        return timesheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JdbcTimesheetDao that = (JdbcTimesheetDao) o;
        return Objects.equals(jdbcTemplate, that.jdbcTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jdbcTemplate);
    }
}
