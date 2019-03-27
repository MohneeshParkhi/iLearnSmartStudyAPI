package com.mohneesh.iLearnSmartStudy.ResponseModels;

public class LoginResponse {
 public String email;

public LoginResponse() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "LoginResponse [email=" + email + "]";
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public LoginResponse(String email) {
	super();
	this.email = email;
}
}
