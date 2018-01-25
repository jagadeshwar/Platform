package com.school.orchestrationweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrchestrationWebApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(OrchestrationWebApplication.class, args);
	}
}
