package com.demo.jdbc;

import com.demo.jdbc.service.EmployeeService;
import com.demo.jdbc.service.EmployeeServiceImpl;

public class JDBCDemo {

	public static void main(String[] args) {
		EmployeeService employee = new EmployeeServiceImpl();
		employee.createTable();
	}

}
