package com.turkcell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String goToHomePage() {
		System.out.println("Home Controller arrived");
		return "index";
	}
}
