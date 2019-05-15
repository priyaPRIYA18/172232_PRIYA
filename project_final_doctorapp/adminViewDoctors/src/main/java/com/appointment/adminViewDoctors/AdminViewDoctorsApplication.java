package com.appointment.adminViewDoctors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AdminViewDoctorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminViewDoctorsApplication.class, args);
	}

}
