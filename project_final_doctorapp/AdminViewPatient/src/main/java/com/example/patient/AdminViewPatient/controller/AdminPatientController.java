package com.example.patient.AdminViewPatient.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.patient.AdminViewPatient.pojo.Patient;
import com.example.patient.AdminViewPatient.service.PatientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminPatientController {
	@Autowired
	private PatientService patientService;

@GetMapping("/getAllPatients")
	public List<Patient>getAlls(){
		System.out.println(patientService.getAll());
		return patientService.getAll();
	}
}
