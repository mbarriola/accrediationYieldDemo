package com.example.yieldstreet.rest.accreditation.service;

import com.example.yieldstreet.rest.accreditation.dto.AccreditationDto;
import com.example.yieldstreet.rest.accreditation.dto.ResponseDto;

/**
 * 
 * @author mbarr
 *
 */
public interface ValidationService {

	/**
	 * @param accreditationDto
	 * @return
	 */
	ResponseDto validate(AccreditationDto accreditationDto);

}
