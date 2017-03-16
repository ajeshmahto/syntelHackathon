package com.syntel.hackathon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public Server home(){
		Server server = new Server("dev","191.10.10.5","linux", "http://v01dev.com:8080/");
		return server;
	}

}
