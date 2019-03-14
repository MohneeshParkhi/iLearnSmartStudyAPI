package com.mohneesh.iLearnSmartStudy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mohneesh.iLearnSmartStudy.exceptions.NonUniqueResourceException;

@ControllerAdvice
public class ILearnSmartStudyExceptionHandler{

	@ExceptionHandler(NonUniqueResourceException.class)
	public ResponseEntity<?> nonUniqueValue(){
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
}
