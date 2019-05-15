package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.patient.Appointment;
import com.example.demo.patient.Doctor;

import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	
	public Doctor register(Doctor doctor) {
		return doctorRepository.save(doctor);
		
		
	}
	
	public Doctor validate(String userName,String password) {
		
		
		  List<Doctor> doctorList=getAllDoctor();
		  System.out.println(doctorList);
		  
		  for(Doctor p:doctorList) {
			  if(p.getEmailId().equals(userName)&&p.getPassword().equals(password))
				  return p;
		  }
			
			
			return null;
		}
	
	
	public List<Doctor> getAllDoctor(){
		return doctorRepository.findAll();
		
	}
	
	
	
	
	
	
	
	
	

}
