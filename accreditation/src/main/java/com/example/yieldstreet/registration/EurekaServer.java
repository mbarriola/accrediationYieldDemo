package com.example.yieldstreet.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Creates a registry server that other applications(micoservices) can talk to
 * See configuration properties at eureka-server.properties
 * Note that we run the Eureka Server on port 1111 not 8761
 * @author mbarr
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-server");

		SpringApplication.run(EurekaServer.class, args);
	}
}
