package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.patient.Appointment;
import com.example.demo.patient.Doctor;
import com.example.demo.patient.Patient;

import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DoctorService doctorService;
//	public Patient create(String username, String password, String patientName, String emailId, String nationality,
//			String address, long phoneNo, int age) {
//		
//		return patientRepository.save(new Patient(username,password,patientName,emailId,nationality,address,phoneNo,age));
//	}
	
	public Patient create(Patient patient) {
		
		return patientRepository.save(patient);
	}
	
	//Retrive operation
	public List<Patient> getAll(){ 
		  return patientRepository.findAll();
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
	
		return patientRepository.save(patient);
	}
	
	
	public Patient validate(String userName,String password) {
		
		
	  List<Patient> patientList=getAll();
	  
	  for(Patient p:patientList) {
		  if(p.getEmail().equals(userName)&&p.getPassword().equals(password))
			  return p;
	  }
		
		
		return null;
	}
	
	
	
	public List<Doctor> getDoctors(String specialization,String location){
		List<Doctor> list=doctorService.getAllDoctor();
		
		List<Doctor> wantedDoctors=new ArrayList<>();
		for(Doctor doctor:list) {
			if(doctor.getSpecilization().equalsIgnoreCase(specialization) && doctor.getLocation().equalsIgnoreCase(location))
				wantedDoctors.add(doctor);
		}
		
		return wantedDoctors;
		
		
		
	}
	
	public Patient makeAppointment(Appointment appointment) {
		
		List<Patient> patientList=patientRepository.findAll();
		Patient currentPatient=null;
		
		for(Patient patient:patientList) {
			if(patient.getEmail().equals(appointment.getPatientEmail()))
				currentPatient=patient;
				
		}
		
		List<Appointment> patientAppointments=currentPatient.getAppointments();
		patientAppointments.add(appointment);
		currentPatient.setAppointments(patientAppointments);
		System.out.println(currentPatient.getAppointments());
		
		
		
		
		
		doctorService.takingAppointment(appointment);
		
		
		return patientRepository.save(currentPatient);
		
		
		
		
		
		
		
	}
	
	public List<Appointment> getAppointments(String pEmail ){
		List<Patient> patientList=getAll();
		for(Patient p:patientList) {
			if(p.getEmail().equals(pEmail)) {
				return p.getAppointments();
			}
		}
		return null;
		
	}


}
