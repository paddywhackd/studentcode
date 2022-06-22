package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {
        String selectPark = "SELECT park_id, park_name, date_established, area, has_camping FROM park WHERE park_id = ?";
        SqlRowSet parkRowSet = jdbcTemplate.queryForRowSet(selectPark, parkId);

        if (parkRowSet.next()) {
            Park park = new Park();

            park.setParkId(parkRowSet.getInt("park_id"));
            park.setParkName(parkRowSet.getString("park_name"));
            if (parkRowSet.getDate("date_established") != null) {
                park.setDateEstablished(parkRowSet.getDate("date_established").toLocalDate());
            } else {
                park.setDateEstablished(parkRowSet.getDate("date_established") == null
                        ? null
                        : parkRowSet.getDate("date_established").toLocalDate());

                Date dateEst = parkRowSet.getDate("date_established");
                park.setDateEstablished(dateEst == null ? null : ((java.sql.Date) dateEst).toLocalDate());

                park.setArea(parkRowSet.getDouble("area"));
                park.setHasCamping(parkRowSet.getBoolean("has_camping"));

                return park;
            } else{
                return null;
            }
        }
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        String selParkByState =
                "SELECT park.park_id, park_name, date_established, area, has_camping " +
                        " FROM " + " park" + " JOIN park_state ON park.park_id = park_state.park_id " +
                        " WHERE" + " state_abbreviation = ?;";
            SqlRowSet parkRowSet = jdbcTemplate.queryForRowSet(SelParkByState, state_abbreviation);

    List<Park> parks = new ArrayList<>();
    while (parkRowSet.next()) {
        parks.add(mapRowToPark())
    }
    }


    @Override
    public Park createPark(Park park) {
       String createPark =
               "INSERT INTO park(park_name, date_established, area, has_camping)
        VALUES (?,?, ?, ?)  RETURNING park_id;"

    }

    @Override
    public void updatePark(Park park) {

    }

    @Override
    public void deletePark(int parkId) {

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {

    }

    private Park mapRowToPark(SqlRowSet parkRowSet) {
        Park park = new Park();

        park.setParkId(parkRowSet.getInt("park_id"));
        park.setParkName(parkRowSet.getString("park_name"));

        if (parkRowSet.getDate("date_established") != null) {
            park.setDateEstablished(parkRowSet.getDate("date_established").toLocalDate());
        } else {
            park.setDateEstablished(parkRowSet.getDate("date_established") == null
                    ? null
                    : parkRowSet.getDate("date_established").toLocalDate());

            Date dateEst = parkRowSet.getDate("date_established");
            park.setDateEstablished(dateEst == null ? null : ((java.sql.Date) dateEst).toLocalDate());

            park.setArea(parkRowSet.getDouble("area"));
            park.setHasCamping(parkRowSet.getBoolean("has_camping"));

            return park;
    }
}
