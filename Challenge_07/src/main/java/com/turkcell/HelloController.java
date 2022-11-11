package com.turkcell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "Finally, Hello You Beautiful World!";
	}
}
