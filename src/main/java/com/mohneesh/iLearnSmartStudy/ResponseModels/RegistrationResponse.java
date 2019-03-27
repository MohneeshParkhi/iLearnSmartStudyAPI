package com.mohneesh.iLearnSmartStudy.ResponseModels;

public class RegistrationResponse {
 public String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "RegistrationResponse [message=" + message + "]";
}

public RegistrationResponse(String message) {
	super();
	this.message = message;
}

public RegistrationResponse() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
