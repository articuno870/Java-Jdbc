package com.demo.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.jdbc.driver.Employee;
import com.demo.jdbc.driver.EmployeeConnection;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public int add(Employee employee) throws SQLException {

		Connection con = EmployeeConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("Insert into Employee(id,name,position) values(?,?,?)");
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getPosition());
		int row = ps.executeUpdate();
		return row;

	}

	@Override
	public List<Employee> get(int id) throws SQLException {
		Connection con = EmployeeConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("Select * from Employee where emp_id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		List<Employee> emplist = new ArrayList<>();
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setPosition(rs.getString("position"));
			emplist.add(emp);
		}
		return emplist;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub

	}

}
