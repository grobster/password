package com.grobster.password;

public class LowerCharactersPassword extends PasswordRequirements {
	private AbstractPassword password;
	
	public LowerCharactersPassword(AbstractPassword password) {
		this.password = password;
		setAllChars(new char[][]{LOWER_LETTERS});
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