package com.grobster.password;

public class PasswordTestDrive {
	public static void main(String[] args) {
		
		AbstractPassword password3 = new PlmCharactersPassword(new AllCharactersPassword(new Password(8)));
		password3.setPasswordLength(4);
		
		password3.createPassword();
		
		System.out.println(password3.getPassword());
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		AbstractPassword password9 = new Password(5);
		password9 = new LowerCharactersPassword(password9);
		password9.createPassword();
		System.out.println(password9.getPassword());
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		AbstractPassword password25 = new Password(12);
		password25 = new UpperCharactersPassword(password25);
		password25.createPassword();
		
		System.out.println(password25.getPassword());
		
	}
	
}