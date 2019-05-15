package com.appointment.patientAppoinment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class PatientAppoinmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientAppoinmentApplication.class, args);
	}

}
