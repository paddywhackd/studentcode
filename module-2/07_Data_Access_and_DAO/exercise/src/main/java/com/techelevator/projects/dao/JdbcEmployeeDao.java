package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String employeeList = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee";
		SqlRowSet empRowSet = jdbcTemplate.queryForRowSet(employeeList);
		while (empRowSet.next()) {
			employees.add(mapRowToEmployee(empRowSet));

		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		return List.of(new Employee());
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		return new ArrayList<>();
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return new ArrayList<>();
	}

	private Employee mapRowToEmployee(SqlRowSet employeeRowSet) {

		Employee employee = new Employee();

		employee.setId(employeeRowSet.getInt("employee_id"));
		employee.setDepartmentId(employeeRowSet.getInt("department_id"));
		employee.setFirstName(employeeRowSet.getString("first_name"));
		employee.setLastName(employeeRowSet.getString("last_name"));
		employee.setBirthDate(employeeRowSet.getDate("birth_date").toLocalDate());
		employee.setHireDate(employeeRowSet.getDate("hire_date").toLocalDate());

		return employee;
	}
}
