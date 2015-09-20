package com.grobster.password;

public abstract class AbstractPassword {
	private int passwordLength;
	private String password;
	public static char[] LOWER_LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	public static char[] UPPER_LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	public static char[] NUMBERS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
	public static char[] SPECIAL = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{', ']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/', '?'};
	public static char[][] ALL_CHARS = {LOWER_LETTERS, UPPER_LETTERS, NUMBERS, SPECIAL};
	
	public AbstractPassword(int length) {
		setPasswordLength(length);
	}
	
	public AbstractPassword() {}
	
	
	abstract String createPassword();
	
	public void setPasswordLength(int passwordLength) {
		if (passwordLength > 0) {
			this.passwordLength = passwordLength;
		}
	}
	
	public int getPasswordLength() {
		return passwordLength;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void setLowerLetters(char[] lowerLetters) {
		LOWER_LETTERS = lowerLetters;
	}
	
	public static void setUpperLetters(char[] upperLetters) {
		UPPER_LETTERS = upperLetters;
	}
	
	public static void setNumbers(char[] numbers) {
		NUMBERS = numbers;
	}
	
	public static void setSpecial(char[] special) {
		SPECIAL = special;
	}
	
	public static void setAllChars(char[][] allChar) {
		ALL_CHARS = allChar;
	}
	
}