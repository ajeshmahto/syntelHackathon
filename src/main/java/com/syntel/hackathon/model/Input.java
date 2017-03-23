package com.syntel.hackathon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Input {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String host;
	private int timeout;
	
	public Input(){
		
	}
	public Input(String host, int port, int timeout) {
		super();
		this.host = host;
		this.timeout = timeout;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	
	

}
