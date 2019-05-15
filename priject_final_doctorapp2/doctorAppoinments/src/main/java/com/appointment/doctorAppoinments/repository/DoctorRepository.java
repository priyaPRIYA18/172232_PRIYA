package com.appointment.doctorAppoinments.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appointment.doctorAppoinments.pojo.Doctor;


@Repository
public interface DoctorRepository extends  MongoRepository<Doctor, String>{
	
	//own methods

}
