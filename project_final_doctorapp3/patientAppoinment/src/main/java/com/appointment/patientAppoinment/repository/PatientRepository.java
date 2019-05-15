package com.appointment.patientAppoinment.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appointment.patientAppoinment.pojo.Patient;


@Repository
public interface PatientRepository extends MongoRepository<Patient,String> {
	
	

}
