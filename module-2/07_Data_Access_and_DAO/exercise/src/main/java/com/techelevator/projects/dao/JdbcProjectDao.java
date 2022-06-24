package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Project getProject(int projectId) {
        String getProject = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?;";
        SqlRowSet projectRowSet = jdbcTemplate.queryForRowSet(getProject, projectId);

        if (projectRowSet.next()) {
            return mapRowToProject(projectRowSet);
        } else {
            return null;
        }

    }

    @Override
    public List<Project> getAllProjects() {


        List<Project> projects = new ArrayList<Project>();

        String projectList = "SELECT project_id, name, from_date, to_date FROM project";
        SqlRowSet projRowSet = jdbcTemplate.queryForRowSet(projectList);
        while (projRowSet.next()) {
            projects.add(mapRowToProject(projRowSet));

        }
        return projects;

    }

    @Override
    public Project createProject(Project newProject) {
        String sql = "INSERT INTO project (name, from_date, to_date)" +
                "VALUES (?, ?, ?) RETURNING project_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());

        return getProject(newId);


    }


    @Override
    public void deleteProject(int projectId) {
        String sql = "DELETE FROM project_employee WHERE project_id = ?;";
        int deletedRows = jdbcTemplate.update(sql, projectId);
        String sql1 = "DELETE FROM project WHERE project_id = ?;";
        int deletedRows1 = jdbcTemplate.update(sql1, projectId);
    }

    private Project mapRowToProject(SqlRowSet projectRowSet) {
        Project project = new Project();

        project.setId(projectRowSet.getInt("project_id"));
        project.setName(projectRowSet.getString("name"));

        if (projectRowSet.getDate("from_date") != null) {
            project.setFromDate(projectRowSet.getDate("from_date").toLocalDate());
        } else {
            project.setFromDate(null);
        }
        if (projectRowSet.getDate("to_date") != null) {
            project.setToDate(projectRowSet.getDate("to_date").toLocalDate());
        } else {
            project.setToDate(null);
        }
        return project;
    }
}
