package com.example.patient.AdminViewPatient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.example.patient.AdminViewPatient.pojo.Adminn;





@Repository
public interface AdminRepoPatient extends MongoRepository<Adminn, String>{
	 

}
