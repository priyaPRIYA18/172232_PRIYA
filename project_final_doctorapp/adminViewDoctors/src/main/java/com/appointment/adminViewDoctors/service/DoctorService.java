package com.appointment.adminViewDoctors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.adminViewDoctors.pojo.Doctor;
import com.appointment.adminViewDoctors.repository.DoctorRepository;



@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	
	
	
	
	public List<Doctor> getAllDoctor(){
		return doctorRepository.findAll();
		
	}
	
	
	

	
	
	
	

}
