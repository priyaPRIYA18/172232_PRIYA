package com.example.admin.Admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.admin.Admin.pojo.Adminn;



@Repository
public interface AminRepoLogin extends MongoRepository<Adminn, String>{
	 

}
