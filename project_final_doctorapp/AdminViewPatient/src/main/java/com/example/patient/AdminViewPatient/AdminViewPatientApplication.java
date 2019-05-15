package com.example.patient.AdminViewPatient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AdminViewPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminViewPatientApplication.class, args);
	}

}
