package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.patient.Adminn;
import com.example.demo.patient.Doctor;
import com.example.demo.patient.Patient;
import com.example.demo.service.AdminServicee;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;

@RequestMapping("/adminn")
@RestController
@CrossOrigin("http://localhost:4200")
public class AdminController1 {
	
	private Adminn currentUser;
	

	@Autowired
	private PatientService patientService;
	
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	
	private AdminServicee adminService;
	
	
	@PostMapping("/registration")
	public Adminn registration(@RequestBody Adminn admin) {
		
		
		
		System.out.println("in controller admin");
		Adminn a=adminService.registration(admin);
		return a;
	} 
	
	
	@RequestMapping("/getAll")
	public List<Adminn>getAll(){
		return adminService.getAll();
		
		
	}
	@RequestMapping("/getAllPatients")
	public List<Patient>getAlls(){
		return patientService.getAll();
	}
	@RequestMapping("/getAllDoctors")
	public List<Doctor>getAllss(){
		return doctorService.getAllDoctor();
	}
	
	
	@RequestMapping("/login")
	public Adminn login(@RequestParam String userName,@RequestParam String password) {
		
		System.out.println("in login");
		currentUser=adminService.validate(userName, password);
		System.out.println(currentUser);
		return currentUser;
				
		
	}

}



