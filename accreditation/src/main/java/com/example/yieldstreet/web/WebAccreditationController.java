package com.example.yieldstreet.web;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.yieldstreet.rest.accreditation.dto.AccreditationDto;
import com.example.yieldstreet.rest.accreditation.dto.ResponseDto;
import com.example.yieldstreet.web.service.AccreditationClientService;
import com.example.yieldstreet.web.service.AccreditationClientServiceImpl;

/**
 * Handles accreditation request from clients
 * @author mbarr
 *
 */
@Controller
public class WebAccreditationController {
	
	@Autowired
	protected AccreditationClientService accreditationService;

	protected Logger logger = Logger.getLogger(WebAccreditationController.class.getName());

	public WebAccreditationController(AccreditationClientServiceImpl additionService) {
		this.accreditationService = additionService;
	}

	/**
	 * Entry point to process requests for accreditation from clients
	 * Annotate with @Valid to enforce spring bean validation to catch json parsing errors.
	 * Use jackson annotations in the dtos to enforce json validation requirements
	 * @param accreditationDto
	 * @return ResponseDto
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/user/accreditation")
	public @ResponseBody ResponseDto processAccreditation(@Valid @RequestBody AccreditationDto accreditationDto) {

		logger.info("Accreditation Request:" + accreditationDto.toString());
		return accreditationService.requestAccreditation(accreditationDto);

	}

	/**
	 * Implementation for demo to handle json parser errors, in a more realistic situation centralize error handling
	 * using {@code @ControllerAdvice}
	 * @param e
	 * @return
	 */
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ErrorResponse handleValidationException(HttpMessageNotReadableException e) {
		
	   return new ErrorResponse(false, e.getMessage(), HttpStatus.BAD_REQUEST.value());
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(RuntimeException.class)
	private ErrorResponse handleAllExceptions(RuntimeException ex) {
		   return new ErrorResponse(false, ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
	}
}
