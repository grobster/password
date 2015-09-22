package com.grobster.password;

public class UpperCharactersPassword extends PasswordRequirements {
	private AbstractPassword password;
	
	public UpperCharactersPassword(AbstractPassword password) {
		this.password = password;
		setAllChars(new char[][]{UPPER_LETTERS});
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