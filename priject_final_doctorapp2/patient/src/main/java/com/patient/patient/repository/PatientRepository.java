package com.patient.patient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.patient.patient.model.Patient;



public interface PatientRepository extends  MongoRepository<Patient,String> {

}
