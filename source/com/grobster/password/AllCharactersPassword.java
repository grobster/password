package com.grobster.password;

public class AllCharactersPassword extends PasswordRequirements {
	private AbstractPassword password;
	
	public AllCharactersPassword(AbstractPassword password) {
		this.password = password;
	}
	
	public String createPassword() {
		password.createPassword();
		System.out.println("before check password: " + password.getPassword());

		if (!meetsMinAllRequirements(password.getPassword())) {
			System.out.println("created password did not meet requirements.  Creating another one");
			createPassword();
		} 
		return password.getPassword();
	}
	
	public String getPassword() {
		return password.getPassword();
	}
	
	public void setPasswordLength(int passwordLength) {
		password.setPasswordLength(passwordLength);
	}
	
}