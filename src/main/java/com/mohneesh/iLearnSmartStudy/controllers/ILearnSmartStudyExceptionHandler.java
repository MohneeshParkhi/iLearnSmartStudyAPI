package com.mohneesh.iLearnSmartStudy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mohneesh.iLearnSmartStudy.exceptions.NonUniqueResourceException;
import com.mohneesh.iLearnSmartStudy.exceptions.UserNotExistException;

@ControllerAdvice
public class ILearnSmartStudyExceptionHandler{

	@ExceptionHandler(NonUniqueResourceException.class)
	public ResponseEntity<?> nonUniqueValue(NonUniqueResourceException ex){
	 return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotExistException.class)
	public ResponseEntity<?> userNotExist(UserNotExistException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
