package com.syntel.hackathon.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syntel.hackathon.model.Input;

@RestController
public class HealthCheckController {
	
	
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
