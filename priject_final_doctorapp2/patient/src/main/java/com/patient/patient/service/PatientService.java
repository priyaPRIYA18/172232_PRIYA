package com.patient.patient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.patient.model.Patient;
import com.patient.patient.repository.*;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientrepository;

	//private DoctorService doctorService;
//	public Patient create(String username, String password, String patientName, String emailId, String nationality,
//			String address, long phoneNo, int age) {
//		
//		return patientRepository.save(new Patient(username,password,patientName,emailId,nationality,address,phoneNo,age));
//	}
	
	public Patient create(Patient patient) {
		
		return patientrepository.save(patient);
	}
	
	//Retrive operation
	public List<Patient> getAll(){ 
		  return patientrepository.findAll();
		}
	
	
	
//	
//	//update operation
//	public Patient update(String address,long phoneno) {
//		Patient p=patientRepository.findByAddress(address);
//		p.setPhoneNo(phoneno);
//		return patientRepository.save(p);
//	}


	//update operation
	public Patient update(Patient patient) {
	
		return patientrepository.save(patient);
	}
	
	
	public Patient validate(String userName,String password) {
		
		
	  List<Patient> patientList=getAll();
	  System.out.println("in service");
	  System.out.println(userName+password);
	  
	  System.out.println(patientList);
	  
	  for(Patient p:patientList) {
		  if(p.getEmail().equals(userName)&&p.getPassword().equals(password)) {
			  System.out.println("its there");
			  return p;
			  
		  }
			  
	  }
		
		
		return null;
	}
	
	

	


	
	
	
}

