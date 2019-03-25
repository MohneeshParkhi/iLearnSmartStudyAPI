package com.mohneesh.iLearnSmartStudy.exceptions;

public class UserNotExistException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public UserNotExistException() {
		super();
	}
 
	public UserNotExistException(String msg) {
		super(msg);
	}
 
}
