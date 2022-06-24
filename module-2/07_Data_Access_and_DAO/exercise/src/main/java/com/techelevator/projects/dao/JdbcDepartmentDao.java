package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {
		String selectDepartment = "select department_id, name from department where department_id = ?;";
		SqlRowSet depRowSet = jdbcTemplate.queryForRowSet(selectDepartment, id);

		if (depRowSet.next()) {
			return mapRowToDepartment(depRowSet);
		} else {
			return null;
		}
	}


	@Override
	public List<Department> getAllDepartments() {
		List<Department> depts = new ArrayList<Department>();

		String deptList = "select department_id, name from department";
		SqlRowSet depRowSet = jdbcTemplate.queryForRowSet(deptList);
		while (depRowSet.next()) {
			depts.add(mapRowToDepartment(depRowSet));
		} return depts;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {

		String updateDept = "UPDATE department SET name = ? WHERE department_id = ?;";
		jdbcTemplate.update(updateDept, updatedDepartment.getName(), updatedDepartment.getId());
	}

	private Department mapRowToDepartment(SqlRowSet deptRowSet) {
		Department department = new Department();

		department.setId(deptRowSet.getInt("department_id"));
		department.setName(deptRowSet.getString("name"));

		return department;
	}
}
