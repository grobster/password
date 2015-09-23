package com.grobster.password;

public class NumberCharactersPassword extends PasswordRequirements {
	private AbstractPassword password;
	
	public NumberCharactersPassword(AbstractPassword password) {
		this.password = password;
		setAllChars(new char[][]{NUMBERS});
	}
	
	public String createPassword() {
		password.createPassword();

		return password.getPassword();
	}
	
	public String getPassword() {
		return password.getPassword();
	}
	
	public void setPasswordLength(int passwordLength) {
		password.setPasswordLength(passwordLength);
	}
}