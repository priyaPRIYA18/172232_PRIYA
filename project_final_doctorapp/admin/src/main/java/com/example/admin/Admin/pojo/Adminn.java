package com.example.admin.Admin.pojo;

import org.springframework.data.annotation.Id;

public class Adminn {
	@Id
	private String emailId;
	private String userName;
	private String password;
	private String phoneNo;
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Adminn(String userName, String password, String phoneNo, String emailId) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Admin [username=" + userName + ", password=" + password + ", phoneNo=" + phoneNo + ", emailId="
				+ emailId + "]";
	}

}
