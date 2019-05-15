package com.example.admin.Admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admin.Admin.pojo.Adminn;

import com.example.admin.Admin.repository.AminRepoLogin;



@Service
public class AdminServiceLogin {
	
	
	@Autowired
	private AminRepoLogin adminRepository;
	
	
	public List<Adminn> getAll(){
		return adminRepository.findAll();
	}

	
	
	public Adminn validate(String userName,String password) {
		
		
		  List<Adminn> adminList=getAll();
		  
		  for(Adminn a:adminList) {
			  if(a.getEmailId().equals(userName)&&a.getPassword().equals(password))
				  return a;
		  }
			
			
			return null;
		}
}
