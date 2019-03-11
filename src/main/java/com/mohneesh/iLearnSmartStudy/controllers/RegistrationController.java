package com.mohneesh.iLearnSmartStudy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohneesh.iLearnSmartStudy.dto.UserDto;
import com.mohneesh.iLearnSmartStudy.modelMapper.RegistrationDtoConversion;
import com.mohneesh.iLearnSmartStudy.models.User;
import com.mohneesh.iLearnSmartStudy.service.RegistrationService;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    @Autowired
	RegistrationService resgisterService;
    
    @Autowired
    RegistrationDtoConversion registrationDToconvert;
    
	@RequestMapping(value="returnString", method=RequestMethod.GET)
	public String CheckSwagger() {
		return "HOME";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ResponseEntity<?> getRegister(@RequestBody UserDto userDto){
		User user = registrationDToconvert.convertToEntity(userDto);
		resgisterService.registerUser(user);
		return new ResponseEntity("User succesfully register", HttpStatus.OK);
	} 
	
}
