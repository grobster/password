package com.grobster.password;

import java.util.regex.*;

public abstract class PasswordRequirements extends AbstractPassword {
	public abstract String createPassword();

	
	public boolean containsUpper(String word) {
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsLower(String word) {
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (Character.isLowerCase(c)) {
				return true;
			}
		}
		
		return false;	
	}
	
	public boolean containsNumber(String word) {
		return word.matches(".*\\d+.*");
	}
	
	public boolean containsSpecial(String word) {
		Pattern p = Pattern.compile("[^a-zA-Z0-9 ]");
		Matcher matcher = p.matcher(word);
		return matcher.find();
	}
	
	public boolean meetsMinAllRequirements(String word) {
		if (containsUpper(word) && containsLower(word) && containsSpecial(word) && containsNumber(word)) {
			return true;
		}
		return false;
	}
}