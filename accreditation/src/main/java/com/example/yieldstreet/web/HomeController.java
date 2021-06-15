package com.example.yieldstreet.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Used to respond to root requests to provide a default html page(s) to clients
 * Can be extended to handle more detailed requests
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