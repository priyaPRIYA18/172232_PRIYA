package com.appointment.patientAppoinment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.patientAppoinment.pojo.Appointment;
import com.appointment.patientAppoinment.pojo.Doctor;
import com.appointment.patientAppoinment.repository.DoctorRepository;



@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	
	public Doctor register(Doctor doctor) {
		return doctorRepository.save(doctor);
		
		
	}
	
	
	
	
	public List<Doctor> getAllDoctor(){
		return doctorRepository.findAll();
		
	}
	
	public boolean takingAppointment(Appointment appointment) {
		System.out.println("in doctor service");
		
		Doctor currentDoctor=null;
		List<Doctor> doctorList=getAllDoctor();
		
		for(Doctor doctor:doctorList) {
			if(doctor.getEmailId().equals(appointment.getDoctorEmail()))
				currentDoctor=doctor;
				
		}
		
		List<Appointment> doctorAppointments=currentDoctor.getApppointments();
		doctorAppointments.add(appointment);
		currentDoctor.setApppointments(doctorAppointments);
		doctorRepository.save(currentDoctor);
		
		System.out.println(currentDoctor);
		
		return true;
		
		
		
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
