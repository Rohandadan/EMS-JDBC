package com.cts.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cts.beans.Employee;

public class dbOperations {

	static Connection con;
	static PreparedStatement preparedStatement;
	static String username = "root";
	static String password = "root";
	static String url = "jdbc:mysql://localhost:3306/employee_db";
	static Statement statement;
	static ResultSet resultSet;

	public static boolean Connect2DB() {
		try {
			con = DriverManager.getConnection(url, username, password);
			return true;
		} catch (Exception e) {
			// TODO: handle exception

			return false;
		}
	}

	public static boolean Insert() {
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?,?)";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, Employee.getEmployeeId());
			preparedStatement.setString(2, Employee.getEmployeeName());
			preparedStatement.setString(3, Employee.getDesgination());
			preparedStatement.setString(4, Employee.getEmail());
			preparedStatement.setString(5, Employee.getLocation());
			preparedStatement.setString(6, Employee.getContactNumber());
			preparedStatement.setDouble(7, Employee.getSalary());

			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}

	}
	
	public static boolean Delete(int Empid) {
		String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEEID = ?";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1,Empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean View(int empid) {
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEEID = "+empid;
		try {
			preparedStatement = con.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery(sql);
			
			if(resultSet.next()) {
				System.out.println("EMPLOYEE ID : "+resultSet.getInt(1));
				 System.out.println("EMPLOYEE NAME : "+resultSet.getString(2));
				 System.out.println("DESIGNATION : "+resultSet.getString(3));
				 System.out.println("EMAIL : "+resultSet.getString(4));
				 System.out.println("LOCATION : "+resultSet.getString(5));
				 System.out.println("PHONE NUMBER : "+resultSet.getString(6));
				 System.out.println("SALARY : "+resultSet.getDouble(7));
				 System.out.println("\n\n");
			}
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static boolean updateName(int empid , String name) {
		String sql = "UPDATE EMPLOYEE SET EMPLOYEENAME = ? WHERE EMPLOYEEID = ? ";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean updatePhone(int empid , String number) {
		String sql = "UPDATE EMPLOYEE SET PHONENUMBER = ? WHERE EMPLOYEEID = ? ";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, number);
			preparedStatement.setInt(2, empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean updateEmail(int empid , String mail) {
		String sql = "UPDATE EMPLOYEE SET EMAIL = ? WHERE EMPLOYEEID = ? ";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, mail);
			preparedStatement.setInt(2, empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean updateLoc(int empid , String loc) {
		String sql = "UPDATE EMPLOYEE SET LOCATION = ? WHERE EMPLOYEEID = ? ";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, loc);
			preparedStatement.setInt(2, empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean updateDesign(int empid , String design) {
		String sql = "UPDATE EMPLOYEE SET DESIGNATION = ? WHERE EMPLOYEEID = ? ";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, design );
			preparedStatement.setInt(2, empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean updateSal(int empid , double sal) {
		String sql = "UPDATE EMPLOYEE SET SALARY = ? WHERE EMPLOYEEID = ? ";
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setDouble(1, sal );
			preparedStatement.setInt(2, empid);
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}
	
//	
//	
//	
}
