package com.mohneesh.iLearnSmartStudy.models;

public class User {
    
	public Long id;
	
	
	public  String email;
	public String password;
	public String username;
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", username=" + username + "]";
	}
	public User(String email, String password, String username) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
