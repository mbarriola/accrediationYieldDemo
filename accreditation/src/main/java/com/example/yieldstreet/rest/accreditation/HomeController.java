package com.example.yieldstreet.rest.accreditation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Directs requests to the root resource to index.html
 * thymeleaf templates are found in src/main/resources
 * @author mbarr
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

}