package com.grobster.password;

public class PasswordTestDrive {
	public static void main(String[] args) {
		
		AbstractPassword password2 = new AllCharactersPassword(new Password(8));
		password2.setPasswordLength(4);
		
		password2.createPassword();
		
		System.out.println(password2.getPassword());
		
	}
	
}