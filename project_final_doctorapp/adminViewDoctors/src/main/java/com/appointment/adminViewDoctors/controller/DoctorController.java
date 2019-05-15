package com.appointment.adminViewDoctors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.adminViewDoctors.pojo.Doctor;
import com.appointment.adminViewDoctors.service.DoctorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	
	
	@Autowired
	private DoctorService doctorService;
	
	
	
	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctor();
		
	}
	
	
	

}
