package com.syntel.hackathon.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syntel.hackathon.model.Input;
import com.syntel.hackathon.model.Server;

@RestController
public class HealthCheckController {
	
	@GetMapping("/home")
	public Server home(){
		Server server = new Server("dev","191.10.10.5","linux", "http://v01dev.com:8080/");
		return server;
	}

	
	@PostMapping("/healthcheck")
	public String check(@RequestBody Input input){
		try {
			HttpURLConnection connection =  (HttpURLConnection ) new URL(input.getHost()).openConnection();
			connection.setConnectTimeout(input.getTimeout());
			connection.setReadTimeout(input.getTimeout());
			connection.setRequestMethod("HEAD");
			int responseCode = connection.getResponseCode();
			if(responseCode >=200 && responseCode<=399 ){
				return "true";
			}
		} catch (IOException e) {
			System.out.println(e.toString());
			return "false";
		}
		
		return "false";
	}
}
