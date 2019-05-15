package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.patient.Adminn;
import com.example.demo.patient.Doctor;
import com.example.demo.patient.Patient;
import com.example.demo.repository.AdminRepositoryy;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;

@Service
public class AdminServicee {

	
	@Autowired
	private AdminRepositoryy adminRepository;
	
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private PatientRepository patientRepository;
	
	public Adminn registration(Adminn admin) {
		return adminRepository.save(admin);
	}
	public List<Doctor> getAllss(){
		return doctorRepository.findAll();
			
		}
	
	
	public List<Patient> getAlls(){
	return patientRepository.findAll();
		
	}
	
	
	public List<Adminn> getAll(){
		return adminRepository.findAll();
	}

	
	public Adminn update(Adminn admin) {
		return adminRepository.save(admin);
		
	}
	
	
	public Adminn validate(String userName,String password) {
		
		
		  List<Adminn> adminList=getAll();
		  
		  for(Adminn a:adminList) {
			  if(a.getEmailId().equals(userName)&&a.getPassword().equals(password))
				  return a;
		  }
			
			
			return null;
		}

}
