package com.example.yieldstreet.rest.accreditation;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * The microservice registers itself with the discovery server provided in the configuration file
 * accreditation-server.properties
 * It will run an embedded tomcat listening in port 2222
 * @author mbarr
 *
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class AccreditationServer {

	protected Logger logger = Logger.getLogger(AccreditationServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "accreditation-server");

		SpringApplication.run(AccreditationServer.class, args);
	}
}
