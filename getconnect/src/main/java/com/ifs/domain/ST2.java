package com.ifs.domain;

public class ST2 {
	
	private String userName;	
	private String userEmail;
	private double number;
	
	public ST2(String userName, String userEmail, double number)
	{
		this.userName = userName;
		this.userEmail = userEmail;
		this.number = number;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}


}
