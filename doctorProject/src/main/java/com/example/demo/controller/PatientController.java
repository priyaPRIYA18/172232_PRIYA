package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.patient.Appointment;
import com.example.demo.patient.Doctor;
import com.example.demo.patient.Patient;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/patient")
public class PatientController {
	
	private Patient currentUser;
	
	@Autowired
	private PatientService patientService;
	
	
	
//	@RequestMapping("create")
//	public String create(@RequestParam String username,@RequestParam String password,@RequestParam String patientName,@RequestParam String emailId,@RequestParam String nationality,@RequestParam String address,@RequestParam long phoneNo,@RequestParam int age) {
//		
//		System.out.println(password);
//		Patient p=patientService.create(username, password,patientName,emailId,nationality,address,phoneNo,age);
//		return p.toString();
//	} 

	@PostMapping("/create")
	public Patient create(@RequestBody Patient patient) {
		
		System.out.println("in contrller");
		
		System.out.println(patient);
		Patient p=patientService.create(patient);
		return p;
	} 
	
	/*
	 * @RequestMapping("/get") public Patient getPerson(@RequestParam String
	 * patientName) { return patientService.getByPatientName(patientName);
	 * 
	 * }
	 */
	@RequestMapping("/getAll")
	public List<Patient>getAll(){
		return patientService.getAll();
		
		
	}
	
	
	@RequestMapping("/login")
	public Patient login(@RequestParam String userName,@RequestParam String password) {
		
		System.out.println("in login controller");
		
		currentUser= patientService.validate(userName, password);
		return currentUser;
				
		
				
		
	}
	
	@RequestMapping("/getDoctors")
	public List<Doctor> getDoctors(@RequestParam String specialization,@RequestParam String location){
		System.out.println("in controller get doctors");
		System.out.println(patientService.getDoctors(specialization,location));
		return patientService.getDoctors(specialization,location);
		
		
	}
	
	
	@RequestMapping("/makeAppointment")
	public Patient makeAppointment(@RequestBody Appointment appointment) {
		
		System.out.println(appointment);
		appointment.setPatientEmail(currentUser.getEmail());
		appointment.setPatientName(currentUser.getFirstName()+" "+currentUser.getLastName());
		
		return patientService.makeAppointment(appointment);
		
		
		
		
		
		
	}
	
	
	@RequestMapping("/getAllAppointments")
	public List<Appointment> getAllAppointments(){ 
		return patientService.getAppointments(currentUser.getEmail());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/update")
//	public String update(@RequestParam String address,@RequestParam long phoneno) {
//		Patient p=patientService.update(address,phoneno);
//		
//		return p.toString();
//		
//	}
	
	@PutMapping("/update")
	public String update(@RequestBody Patient patient ) {
		System.out.println("in contrller");
		patientService.update(patient);
		return "updated successfully";
		
	}
	
	
}
