package com.patient.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.patient.patient.model.Patient;
import com.patient.patient.service.PatientService;



@CrossOrigin("*")
@RestController
public class PatientController {
	

	private Patient currentUser;

	
	
	//@Value(value = "${server.port}")
	private String port;
	
	@Autowired
	private PatientService patientService;
	
	
	@PostMapping("/create")
	
	public Patient create(@RequestBody Patient patient) {
		System.out.println();
		System.out.println("in contrller");
		System.out.println(port);
		System.out.println(patient);
		Patient p=patientService.create(patient);
		return p;
	} 
	@GetMapping("/login")
	public Patient login(@RequestParam String userName,@RequestParam String password) {
		
		System.out.println("in login controller");
		
		System.out.println(userName+password);
		
		currentUser= patientService.validate(userName, password);
		System.out.println(currentUser);
		return currentUser;
}
}
