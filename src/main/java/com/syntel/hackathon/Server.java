package com.syntel.hackathon;

public class Server {
	private String name;
	private String ip;
	private String environment;
	private String url;
	
	
	public Server(String name, String ip, String environment, String url) {
		super();
		this.name = name;
		this.ip = ip;
		this.environment = environment;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
