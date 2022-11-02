package com.demo.jdbc.repo;

import java.util.List;

import com.demo.jdbc.driver.Employee;

public interface EmployeeRepository {

	public int add();

	public List<Employee> get();

	public void update();

	public void createTable();

}
