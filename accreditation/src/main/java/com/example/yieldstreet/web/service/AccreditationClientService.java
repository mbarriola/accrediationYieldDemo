package com.example.yieldstreet.web.service;

import com.example.yieldstreet.rest.accreditation.dto.AccreditationDto;
import com.example.yieldstreet.rest.accreditation.dto.ResponseDto;

/**
 * See impl class
 * @author mbarr
 *
 */
public interface AccreditationClientService {

	/**
	 * @param accreditationDto
	 * @return ResponseDto
	 */
	ResponseDto requestAccreditation(AccreditationDto accreditationDto);
}
