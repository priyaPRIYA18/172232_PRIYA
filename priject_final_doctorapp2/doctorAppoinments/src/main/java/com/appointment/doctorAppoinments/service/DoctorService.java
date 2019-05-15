package com.appointment.doctorAppoinments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.doctorAppoinments.pojo.Appointment;
import com.appointment.doctorAppoinments.pojo.Doctor;
import com.appointment.doctorAppoinments.repository.DoctorRepository;


@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	

	
	public List<Doctor> getAllDoctor(){
		return doctorRepository.findAll();
		
	}
	
	
	
	public List<Appointment> getAppointments(String pEmail ){
		List<Doctor> doctorList=getAllDoctor();
		for(Doctor p:doctorList) {
			if(p.getEmailId().equals(pEmail)) {
				return p.getApppointments();
			}
		}
		return null;
		
	}
	
	
	
	
	

}
