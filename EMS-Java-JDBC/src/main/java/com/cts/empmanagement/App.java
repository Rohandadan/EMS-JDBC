package com.cts.empmanagement;

import java.util.Scanner;

import com.cts.DAO.dbOperations;
import com.cts.service.UserFunctions;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean i = dbOperations.Connect2DB();

		UserFunctions uf = new UserFunctions();
		boolean b = true;
		while (b) {
			System.out.println("1. CREATE EMPLOYEE\n" + "2. DELETE EMPLOYEE\n" + "3. VIEW EMPLOYEES\n 4. UPDATE");
			System.out.println("Enter your choice : ");
			char ch = sc.next().charAt(0);

			switch (ch) {
			case '1':
				if (i) {
					uf.Details();
				} else {
					System.out.println("Connection Failed");
				}
				break;
			case '2':
				if (i) {
					uf.DeleteEmp();
				} else {
					System.out.println("Connection Failed");
				}
				break;
			case '3':
				if (i) {

					uf.Display();
				} else {
					System.out.println("Connection Failed");
				}
				break;
			case '4':
				if (i) {
					uf.updateemployee();
				} else {
					System.out.println("Connection Failed");
				}
				break;
			default:
				break;
			}
		}

	}
}
