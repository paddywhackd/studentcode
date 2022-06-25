package com.techelevator;

import com.techelevator.dao.PizzaDAO;

import javax.sql.DataSource;

public class JdbcPizzaDAO implements PizzaDAO {


    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;




}
