package com.demo.jdbc.repo;

import com.demo.jdbc.driver.Employee;
import com.demo.jdbc.driver.EmployeeConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	public void createTable() {
		Connection con = EmployeeConnection.getConnection();
		try (Statement stmt = con.createStatement();) {
			String tableSql = "CREATE TABLE IF NOT EXISTS employees"
					+ "(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30),"
					+ "position varchar(30), salary double)";
			stmt.execute(tableSql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
