package com.grobster.password;

public class Password extends AbstractPassword {
	private String password;
	
	public Password(int passwordLength) {
		super(passwordLength);
	}
	
	public Password() {
		super();
	}
	
	public String createPassword() {
		StringBuilder createdPassword = new StringBuilder();
		for (int i = 0; i < getPasswordLength(); i++) {
			int randomArrayNumber = (int) (Math.random() * ALL_CHARS.length);
			char[] randomArray = ALL_CHARS[randomArrayNumber];
			int randomCharNumber = (int) (Math.random() * randomArray.length);
			char randomChar = randomArray[randomCharNumber];
			createdPassword.append(randomChar);
		}
		return password = createdPassword.toString();
	}	
}