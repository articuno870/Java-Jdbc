package com.demo.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.jdbc.driver.Employee;

public interface EmployeeService {

	public int add(Employee employee) throws SQLException;

	public List<Employee> get(int id) throws SQLException;

	public void update();

	public void createTable();
}
