package com.cts.service;

import java.util.Random;
import java.util.Scanner;

import com.cts.DAO.dbOperations;
import com.cts.beans.Employee;

public class UserFunctions {
	static Scanner sc = new Scanner(System.in);

	public void Details() {

		int Empid = GeneraterId();
		Validations val = new Validations();
		System.out.print("Enter the Employee name : ");
		String name = val.validateName();
		System.out.print("Enter the Employee Email : ");
		String email = sc.next();
		System.out.print("Enter the Employee Designation : ");
		String designation = sc.next();
		System.out.print("Enter the Employee Location : ");
		String location = sc.next();
		System.out.print("Enter the Employee Contact Number : ");
		String phoneNumber = val.phoneCheck();
		System.out.print("Enter the Employee Salary : ");
		double salary = sc.nextDouble();

		new Employee(name, email, designation, location, phoneNumber, Empid, salary);
		boolean in = dbOperations.Insert();
		if (in) {
			System.out.println("Employee Added Successfully!!!");
			System.out.println("Employee ID : " + Empid);
		} else {
			System.out.println("Employee Couldn't be added!!");
		}
	}

	public static void DeleteEmp() {
		System.out.println("Enter the Employee ID : ");
		int id = sc.nextInt();
		boolean d = dbOperations.Delete(id);
		if (d) {
			System.out.println("Deleted Successfully!!");
		} else {
			System.out.println("Failed");
		}
	}

	public void Display() {
		dbOperations db = new dbOperations();
		System.out.println("Enter the Employee ID : ");
		int eid = sc.nextInt();
		boolean i = db.View(eid);
		if (i) {
			System.out.println("End of list");
		} else {
			System.out.println("No entries");
		}
	}

	public void updateemployee() {
		System.out.println("Enter the Employee ID : ");
		int eid = sc.nextInt();

		System.out.println("Select an option\n" + "1. Update Employee's Name\n" + "2. Update Employee's Mobile\n"
				+ "3. Update Employee's Email\n" + "4. Update Employee's City\n" + "5. Update Employee's Designation\n"
				+ "6. Update Employee's Salary\n" + "7. Update all details\n" + "8. Exit");
		int s = sc.nextInt();
		switch (s) {
		case 1:
			System.out.println("Enter the New Employee Name : ");
			String name = sc.next();

			boolean ua = dbOperations.updateName(eid, name);
			if (ua) {
				System.out.println("Name updated Successfully!!!");
			} else {
				System.out.println("Something went Wrong!!");
			}
			break;
		case 2:
			System.out.println("Enter the new contact");
			String phno = sc.next();
			boolean up = dbOperations.updatePhone(eid, phno);
			if (up) {
				System.out.println("Contact updated Successfully");
			} else {
				System.out.println("Something went Wrong!!");
			}

			break;
		case 3:
			System.out.println("Enter the new email");
			String email = sc.next();
			boolean ue = dbOperations.updateEmail(eid, email);
			if (ue) {
				System.out.println("Email updated Successfully");
			} else {
				System.out.println("Something went Wrong!!");
			}
			break;
		case 4:
			System.out.println("Enter the new Location : ");
			String city = sc.next();
			boolean ul = dbOperations.updateLoc(eid, city);
			if (ul) {
				System.out.println("Location updated Successfully");
			} else {
				System.out.println("Something went Wrong!!");
			}
			break;
		case 5:
			System.out.println("Enter the new designation");
			String desig = sc.next();
			boolean ud = dbOperations.updateDesign(eid, desig);
			if (ud) {
				System.out.println("Designation updated Successfully");
			} else {
				System.out.println("Something went Wrong!!");
			}
			break;
		case 6:
			System.out.println("Enter the new salary");
			double sal = sc.nextDouble();
			boolean us = dbOperations.updateSal(eid, sal);
			if (us) {
				System.out.println("Salary updated Successfully");
			} else {
				System.out.println("Something went Wrong!!");
			}
			System.out.println("Salary updated Successfully");
			break;
		case 8:
			System.out.println("Thank you");
			System.exit(0);
		default:
			System.out.println("Enter the correct value");
		}

	}

	public int GeneraterId() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}

}
