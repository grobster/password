package com.grobster.password;

public abstract class PasswordRequirements extends AbstractPassword {
	protected boolean containsUpperChar = !getPassword().equals(getPassword().toLowerCase());
	protected boolean containsLowerChar = !getPassword().equals(getPassword().toUpperCase());
	protected boolean containsNumber = getPassword().matches(".*\\d+.*");
	protected boolean containsSpecialChar = !getPassword().matches("[A-Za-z0-9]*");
	
	
	public abstract String createPassword();
}