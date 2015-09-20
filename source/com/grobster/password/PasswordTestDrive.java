package com.grobster.password;

public class PasswordTestDrive {
	public static void main(String[] args) {
		AbstractPassword password = new Password(11);
		password.createPassword();
		System.out.println(password.getPassword());
	}
	
}