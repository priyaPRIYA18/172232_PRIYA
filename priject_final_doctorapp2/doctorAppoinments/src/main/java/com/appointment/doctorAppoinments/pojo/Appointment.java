package com.appointment.doctorAppoinments.pojo;

import java.util.Date;

public class Appointment {
	
	
	private String patientEmail;
	private String problem;
	private String location;
	private String doctorName;
	private String doctorEmail;
	private Date date;
	private String patientName;
	
	
	
	
	
	
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public Appointment(String problem, String location, String doctorName,
			String doctorEmail, Date date) {
		super();
		
		this.problem = problem;
		this.location = location;
		this.doctorName = doctorName;
		this.doctorEmail = doctorEmail;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Appointment [patientEmail=" + patientEmail + ", problem=" + problem + ", location=" + location
				+ ", doctorName=" + doctorName + ", doctorEmail=" + doctorEmail + ", date=" + date + "]";
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
