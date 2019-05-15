package com.appointment.patientAppoinment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appointment.patientAppoinment.pojo.Doctor;

@Repository
public interface DoctorRepository extends  MongoRepository<Doctor, String>{
	
	//own methods

}
