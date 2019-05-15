package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.patient.Adminn;

@Repository
public interface AdminRepositoryy extends MongoRepository<Adminn, String> {
	

}
