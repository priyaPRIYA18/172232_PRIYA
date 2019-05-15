package com.appointment.patientAppoinment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.patientAppoinment.pojo.Appointment;
import com.appointment.patientAppoinment.pojo.Doctor;
import com.appointment.patientAppoinment.pojo.Patient;
import com.appointment.patientAppoinment.service.PatientService;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
	
	

	@PostMapping("/makeAppointment")
	public Patient makeAppointment(@RequestBody Appointment appointment) {
		
		System.out.println(appointment);
		//appointment.setPatientEmail(currentUser.getEmail());
		//appointment.setPatientName(currentUser.getFirstName()+" "+currentUser.getLastName());
		
		return patientService.makeAppointment(appointment);
		
	}
	
	
	@GetMapping("/getAllAppointments")
	public List<Appointment> getAllAppointments(@RequestParam String email){ 
		return patientService.getAppointments(email);
		
		
	}
	
	@GetMapping("/getDoctors")
	public List<Doctor> getDoctors(@RequestParam String specialization,@RequestParam String location){
		System.out.println("in controller get doctors");
		System.out.println(patientService.getDoctors(specialization,location));
		return patientService.getDoctors(specialization,location);
		
		
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Patient patient ) {
		System.out.println("in contrller");
		patientService.update(patient);
		return "updated successfully";
		
	}
	
	
}
