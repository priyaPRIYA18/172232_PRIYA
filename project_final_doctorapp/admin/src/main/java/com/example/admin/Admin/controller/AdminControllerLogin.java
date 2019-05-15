package com.example.admin.Admin.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.Admin.pojo.Adminn;
import com.example.admin.Admin.service.AdminServiceLogin;




@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class AdminControllerLogin {

private Adminn currentUser;
@Autowired

private AdminServiceLogin adminService;


@GetMapping("/login")
public Adminn login(@RequestParam String userName,@RequestParam String password) {
	
	System.out.println("in login");
	currentUser=adminService.validate(userName, password);
	System.out.println(currentUser);
	return currentUser;
			
	
}

	
}
