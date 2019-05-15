package com.appointment.doctorAppoinments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.doctorAppoinments.pojo.Appointment;
import com.appointment.doctorAppoinments.pojo.Doctor;
import com.appointment.doctorAppoinments.service.DoctorService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	
	private Doctor currentDoctor;
	
	@Autowired
	private DoctorService doctorService;
	
	
	
	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctor();
		
	}
	
	@GetMapping("/getAllAppointments")
	public List<Appointment> getAllAppointments(@RequestParam String email){ 
		return doctorService.getAppointments(email);
		
		
	}
	
	

}
