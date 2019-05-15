package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.patient.Appointment;
import com.example.demo.patient.Doctor;
import com.example.demo.patient.Patient;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("http://localhost:4200")
public class DoctorController {
	
	private Doctor currentDoctor;
	
	@Autowired
	private DoctorService doctorService;
	@RequestMapping("/register")
	public Doctor register(@RequestBody Doctor doctor) {
		
		System.out.println("in contrller");
		Doctor  d=doctorService.register(doctor);
		return d;
	}
	
	
	@RequestMapping("/login")
	public Doctor login(@RequestParam String userName,@RequestParam String password) {
		
		System.out.println("in login controller");
		
		System.out.println(userName);
	   currentDoctor= doctorService.validate(userName, password);
		return currentDoctor;		
		
	}
	
	
	
	@RequestMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctor();
		
	}
	
	@RequestMapping("/getAllAppointments")
	public List<Appointment> getAllAppointments(){ 
		return doctorService.getAppointments(currentDoctor.getEmailId());
		
		
	}
	
	

}
