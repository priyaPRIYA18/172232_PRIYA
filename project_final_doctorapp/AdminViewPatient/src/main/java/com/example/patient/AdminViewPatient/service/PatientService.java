package com.example.patient.AdminViewPatient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patient.AdminViewPatient.pojo.Patient;
import com.example.patient.AdminViewPatient.repository.PatientRepository;



@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	
	public List<Patient> getAll(){ 
		  return patientRepository.findAll();
		}




}
