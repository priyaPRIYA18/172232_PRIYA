package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.patient.Doctor;

@Repository
public interface DoctorRepository extends  MongoRepository<Doctor, String>{
	
	//own methods

}
