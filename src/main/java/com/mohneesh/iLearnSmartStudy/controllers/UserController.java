package com.mohneesh.iLearnSmartStudy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohneesh.iLearnSmartStudy.dto.LoginDto;
import com.mohneesh.iLearnSmartStudy.dto.UserDto;
import com.mohneesh.iLearnSmartStudy.exceptions.NonUniqueResourceException;
import com.mohneesh.iLearnSmartStudy.exceptions.UserNotExistException;
import com.mohneesh.iLearnSmartStudy.modelMapper.ConvertDtoToModal;
import com.mohneesh.iLearnSmartStudy.models.Login;
import com.mohneesh.iLearnSmartStudy.models.User;
import com.mohneesh.iLearnSmartStudy.service.LoginService;
import com.mohneesh.iLearnSmartStudy.service.RegistrationService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
	RegistrationService resgisterService;
    
    @Autowired
    ConvertDtoToModal convertDto;
    
    @Autowired
    LoginService loginService;
    
    String   username;
    
	@RequestMapping(value="returnString", method=RequestMethod.GET)
	public String CheckSwagger() {
		return "HOME";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ResponseEntity<?> getRegister(@RequestBody UserDto userDto) throws NonUniqueResourceException{
		User user = convertDto.convertToEntity(userDto);
		resgisterService.registerUser(user);
		return new ResponseEntity("User succesfully register", HttpStatus.OK);
	} 
	
	@RequestMapping(value="loginUser", method=RequestMethod.POST)
	public ResponseEntity<?> getLoginUser(@RequestBody LoginDto loginDto) throws UserNotExistException{
		Login login = convertDto.convertToLogin(loginDto);
		this.username = loginService.getLoginUser(login);
	    return new ResponseEntity<>(this.username,HttpStatus.OK);	
	}
}
