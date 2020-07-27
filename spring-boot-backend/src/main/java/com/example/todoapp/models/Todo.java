package com.example.todoapp.models;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
//import java.util.Date;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection="todos")

//@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Todo {
//
@Id
String id;	
String firstName;
String lastName;
String emailid;
@Size(max=100)
int mobileno;
String address;
String location;




public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public int getMobileno() {
	return mobileno;
}

public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public Todo(String id,String firstName, String lastName, String emailid, int mobileno, String address,
		String location) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailid = emailid;
	this.mobileno = mobileno;
	this.address = address;
	this.location = location;
}

@Override
public String toString() {
	return "Todo [id=" + id +",firstName=" + firstName + ", lastName=" + lastName + ", emailid=" + emailid
			+ ", mobileno=" + mobileno + ", address=" + address + ", location=" + location + "]";
}



}
