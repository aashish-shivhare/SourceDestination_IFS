package com.ifs.domain;

public class DT2 {
	
	private String fullName;	
	private String personalEmail;
	private double personalNumber;
	
	public DT2(String fullName, String personalEmail, double personalNumber)
	{
		this.fullName = fullName;
		this.personalEmail = personalEmail;
		this.personalNumber = personalNumber;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public double getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(double personalNumber) {
		this.personalNumber = personalNumber;
	}

}
