package com.example.yieldstreet.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.example.yieldstreet.web.service.AccreditationClientServiceImpl;

/**
 * Web server configuration to support client requests that will be routed to the appropriated 
 * microservices using a Eureka registration service. It will use a load balancer client to 
 * support increases in load and fail over. Spring Cloud uses a httpClient that through Ribbon will do 
 * the microservices lookup and load balancing
 * The configuration file is web-server.properties and the web server is listening in port 3333
 * @author mbarr
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class WebServer {

	public static final String ACCREDITATION_SERVICE_URL = "http://accreditation-service";

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "web-server");
		SpringApplication.run(WebServer.class, args);
	}

	@LoadBalanced
	@Bean
	//RestTemplate client uses a load balancer
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AccreditationClientServiceImpl accreditationService() {
		return new AccreditationClientServiceImpl(ACCREDITATION_SERVICE_URL);
	}

	@Bean
	public WebAccreditationController accreditationController() {
		return new WebAccreditationController(accreditationService());
	}

	@Bean
	public HomeController homeController() {
		return new HomeController();
	}
}