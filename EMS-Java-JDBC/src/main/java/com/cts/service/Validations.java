package com.cts.service;

import java.util.Scanner;

public class Validations {
	
	public String phoneCheck() {
		Scanner sc = new Scanner(System.in);
		String num;
		boolean b = true;
		do {
			num = sc.next();
			if(num.matches("[6-9]{1}[0-9]{9}")) {
				b = false;
			}else {
				System.out.println("Enter the number in correct format!!");
				System.out.println("Enter the phone number : ");
			}
		}while(b);
		return num;
	}
	
	public String validateName() {
		Scanner sc = new Scanner(System.in);
		String name="";
		boolean b = true;
		while (b) {
			name = sc.next();
			if(name.matches("[A-za-z]+$")) {
				b = false;
			}else {
				System.out.println("Name should be in alphabets only");
		System.out.println("Enter the name");
			}
		}
		return name;
	}
}
