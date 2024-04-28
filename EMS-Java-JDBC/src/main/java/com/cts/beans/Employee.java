	package com.cts.beans;

public class Employee {
	private static String EmployeeName, Email, Desgination, Location, ContactNumber;
	private static int EmployeeId;
	private static double Salary;

	public static String getEmployeeName() {
		return EmployeeName;
	}

	public static void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public static String getEmail() {
		return Email;
	}

	public static void setEmail(String email) {
		Email = email;
	}

	public static String getDesgination() {
		return Desgination;
	}

	public static void setDesgination(String desgination) {
		Desgination = desgination;
	}

	public static String getLocation() {
		return Location;
	}

	public static void setLocation(String location) {
		Location = location;
	}

	public static String getContactNumber() {
		return ContactNumber;
	}

	public static void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public static int getEmployeeId() {
		return EmployeeId;
	}

	public static void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public static double getSalary() {
		return Salary;
	}

	public static void setSalary(double salary) {
		Salary = salary;
	}

	public Employee(String EmployeeName, String Email, String Desgination, String Location, String ContactNumber,
			int id, double salary) {
		// TODO Auto-generated constructor stub
		this.EmployeeName = EmployeeName;
		this.Email = Email;
		this.Desgination =Desgination;
		this.Location = Location;
		this.ContactNumber = ContactNumber;
		this.EmployeeId = id;
		this.Salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
