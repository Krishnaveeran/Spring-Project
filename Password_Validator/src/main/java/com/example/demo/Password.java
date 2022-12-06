package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Password {

	@Id
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String isValidPassword() {
		// TODO Auto-generated method stub

		boolean val = true;

		if (password.length() > 15 || password.length() < 8) {
			System.out.println("Password must be less than 15 and more than 8 characters in length");
			val = false;
		}

		String upperCase = "(.*[A-Z].*)";
		if (!password.matches(upperCase)) {
			System.out.println("Password must have atleast one uppercase character");
			val = false;
		}

		String lowerCase = "(.*[a-z].*)";
		if (!password.matches(lowerCase)) {
			System.out.println("Password must have atleast one lowercase character");
			val = false;
		}
		String numbers = "(.*[0-9].*)";
		if (!password.matches(numbers)) {
			System.out.println("Password must have atleast one number");
			val = false;
		}

		String specialChars = "(.*[@,#,$,%,&,*].*)";
		if (!password.matches(specialChars)) {
			System.out.println("Password must have atleast one special character among @ # $ % & *");
			val = false;
		}

		if (val == true) {
			return "Valid Password";
		} else {

		}
		return "Invalid Password !!!";

	}

}
