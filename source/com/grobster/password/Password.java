package com.grobster.password;

public class Password {
	private int passwordLength;
	private String password;
	public static final char[] LOWER_LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	public static final char[] NUMBERS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
	public static final char[][] ALL_CHARS = {LOWER_LETTERS, NUMBERS};
	
	
	public String createPassword() {
		StringBuilder createdPassword = new StringBuilder();
		for (int i = 0; i < passwordLength; i++) {
			int randomArrayNumber = (int) (Math.random() * ALL_CHARS.length);
			char[] randomArray = ALL_CHARS[randomArrayNumber];
			int randomCharNumber = (int) (Math.random() * randomArray.length);
			char randomChar = randomArray[randomCharNumber];
			createdPassword.append(randomChar);
		}
		password = createdPassword.toString();
		return password;
	}
	
	public void setPasswordLength(int passwordLength) {
		this.passwordLength = passwordLength;
	}
	
	public int getPasswordLength() {
		return passwordLength;
	}
	
	public String getPassword() {
		return password;
	}
	
}