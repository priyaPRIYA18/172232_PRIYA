package com.appointment.adminViewDoctors.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appointment.adminViewDoctors.pojo.Doctor;


@Repository
public interface DoctorRepository extends  MongoRepository<Doctor, String>{
	
	//own methods

}
