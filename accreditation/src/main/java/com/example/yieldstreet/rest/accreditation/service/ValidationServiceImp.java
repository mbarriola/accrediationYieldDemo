package com.example.yieldstreet.rest.accreditation.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.yieldstreet.rest.accreditation.dto.AccreditationDto;
import com.example.yieldstreet.rest.accreditation.dto.ResponseDto;

/**
 * Simple implementation of a service that validates(verifies) the accreditation requests
 * @author mbarr
 *
 */
@Service
public class ValidationServiceImp implements ValidationService{

	/**
	 * Uses a random boolean to approve a request for accreditation
	 * @param accreditationDto
	 * @return
	 */
	@Override
	public ResponseDto validate(AccreditationDto accreditationDto) {
		
		Random rd = new Random();
		ResponseDto responseDto = new ResponseDto();
		responseDto.setSuccess(true);
		responseDto.setAccredited(rd.nextBoolean());
		return responseDto;
	}

}
