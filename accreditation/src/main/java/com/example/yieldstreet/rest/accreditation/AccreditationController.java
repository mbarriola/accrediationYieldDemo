package com.example.yieldstreet.rest.accreditation;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.yieldstreet.rest.accreditation.dto.AccreditationDto;
import com.example.yieldstreet.rest.accreditation.dto.ResponseDto;
import com.example.yieldstreet.rest.accreditation.service.ValidationService;

/**
 * Entry point for accreditation requests from clients
 * @author mbarr
 *
 */
@RestController
public class AccreditationController {

	protected Logger logger = Logger.getLogger(AccreditationController.class.getName());
	
	@Autowired
	private ValidationService validationService;

	//Annotate with @Valid to enforce spring bean validation
	@PostMapping("/validate")
	public @ResponseBody ResponseDto validate(@Valid @RequestBody AccreditationDto accreditationDto) {

		return validationService.validate(accreditationDto);
	}
}
