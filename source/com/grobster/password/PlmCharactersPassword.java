package com.grobster.password;

public class PlmCharactersPassword extends PasswordRequirements {
	private AbstractPassword password;
	
	public PlmCharactersPassword(AbstractPassword password) {
		this.password = password;
		minPasswordLength = 8;
		char[] plmSpecialChars = {'+', '!', '-', '$', '*', '&', '^', '/', '%', '|', '\'', '?', '<', '>', '_', ':'};
		setSpecial(plmSpecialChars);
	}
	
	public String createPassword() {
		password.createPassword();
		System.out.println("before check password: " + password.getPassword());

		if (firstCharacterHasExcludedCharacter(password.getPassword()) && minPasswordLength <= password.getPassword().length()) {
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
	
	private boolean firstCharacterHasExcludedCharacter(String word) {
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == '?' || c == '!') {
				return true;
			}
		}
		return false;
	}
}