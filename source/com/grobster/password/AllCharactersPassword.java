package com.grobster.password;

public class AllCharactersPassword extends PasswordRequirements {
	private AbstractPassword password;
	
	public AllCharactersPassword(AbstractPassword password) {
		this.password = password;
	}
	
	public String createPassword() {
		return null;
	}
	
}