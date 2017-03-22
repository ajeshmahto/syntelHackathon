package com.syntel.hackathon.model;

public class Input {
	private String host;
	private int timeout;
	
	public Input(){
		
	}
	public Input(String host, int port, int timeout) {
		super();
		this.host = host;
		this.timeout = timeout;
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
