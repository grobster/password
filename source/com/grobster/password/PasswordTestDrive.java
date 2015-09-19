package com.grobster.password;

public class PasswordTestDrive {
	public static void main(String[] args) {
		Password password = new Password(11);
		String p = password.createPassword();
		System.out.println(p);
	}
	
}