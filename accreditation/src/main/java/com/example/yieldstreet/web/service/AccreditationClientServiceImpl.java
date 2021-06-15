package com.example.yieldstreet.web.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.yieldstreet.rest.accreditation.dto.AccreditationDto;
import com.example.yieldstreet.rest.accreditation.dto.ResponseDto;

/**
 * Uses a load balanced RestTemplate to connect to the Accreditation rest service via Eureka
 * For this demo we have all the services in a single module but in a production environment 
 * we will have the rest services in separated modules in a cluster so that the client load balancer
 * can react to server failures and changes in load.
 * @author mbarr
 *
 */
@Service
public class AccreditationClientServiceImpl implements AccreditationClientService{

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	protected Logger logger = Logger.getLogger(AccreditationClientServiceImpl.class.getName());

	public AccreditationClientServiceImpl(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl: "http://" + serviceUrl;
	}

	/**
	 * @param accreditationDto
	 * @return ResponseDto
	 */
	@Override
	public ResponseDto requestAccreditation(AccreditationDto accreditationDto) {
		return restTemplate.postForObject(serviceUrl + "/validate", accreditationDto, ResponseDto.class);
	}
}
