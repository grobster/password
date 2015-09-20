package com.grobster.password;

public class PasswordTestDrive {
	public static void main(String[] args) {
		
		AbstractPassword password3 = new PlmCharactersPassword(new AllCharactersPassword(new Password(8)));
		password3.setPasswordLength(8);
		
		password3.createPassword();
		
		System.out.println(password3.getPassword());
		
	}
	
}