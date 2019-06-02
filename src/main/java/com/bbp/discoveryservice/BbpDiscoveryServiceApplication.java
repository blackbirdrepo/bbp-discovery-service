package com.bbp.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BbpDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbpDiscoveryServiceApplication.class, args);
	}

}
