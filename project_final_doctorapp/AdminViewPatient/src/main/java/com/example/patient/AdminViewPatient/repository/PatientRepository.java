package com.example.patient.AdminViewPatient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import org.springframework.stereotype.Repository;

import com.example.patient.AdminViewPatient.pojo.Patient;





@Repository
public interface PatientRepository extends MongoRepository<Patient, String>{
	 

}
