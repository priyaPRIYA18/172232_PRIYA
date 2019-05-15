package com.appointment.doctorAppoinments.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctor {
	
	@Id
	private String emailId;
	private String name;
	private String qualification;
	private String location;
	private String experience;
	private String specilization;
	private String phoneNumber;
	private String password;
	private int age;
	
	List<Appointment> appointments=new ArrayList<>();
	public List<Appointment> getApppointments() {
		return appointments;
	}
	public void setApppointments(List<Appointment> apppointments) {
		this.appointments = apppointments;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	
	@Override
	public String toString() {
		return "Doctor [emailId=" + emailId + ", name=" + name + ", qualification=" + qualification + ", location="
				+ location + ", experience=" + experience + ", specilization=" + specilization + ", phoneNumber="
				+ phoneNumber + ", password=" + password + ", age=" + age + ", appointments=" + appointments + "]";
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
