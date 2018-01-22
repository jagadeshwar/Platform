package com.school.orchestrationadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrchestrationAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestrationAdminApplication.class, args);
	}
}
