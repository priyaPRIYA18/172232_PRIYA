package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.patient.Appointment;
import com.example.demo.patient.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	
	
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/register")
	public Doctor register(@RequestBody Doctor doctor) {
		
		System.out.println("in contrller");
		Doctor  d=doctorService.register(doctor);
		return d;
	}
	
	
	@GetMapping("/login")
	public Doctor login(@RequestParam String userName,@RequestParam String password) {
		
		System.out.println("in login controller");
		
		System.out.println(userName+password);
	   return doctorService.validate(userName, password);
				
		
	}
	
	
	
	
	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctor();
		
	}
	
	
	

}
