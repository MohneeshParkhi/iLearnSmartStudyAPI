package com.mohneesh.iLearnSmartStudy.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    
    String   userLoginStatus;
    
    
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
    
	
	
	@RequestMapping(value="returnString", method=RequestMethod.GET)
	public String CheckSwagger() {
		return "HOME";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ResponseEntity<?> getRegister(@RequestBody UserDto userDto) throws NonUniqueResourceException{
		User user = convertDto.convertToEntity(userDto);
		if(log.isDebugEnabled())
			log.debug("REGISTERING THE USER");
		
		log.info("REGISTERING THE USER");
		resgisterService.registerUser(user);
		return new ResponseEntity("User succesfully register", HttpStatus.OK);
	} 
	
	@RequestMapping(value="loginUser", method=RequestMethod.POST)
	public ResponseEntity<?> getLoginUser(@RequestBody LoginDto loginDto) throws UserNotExistException{
		Login login = convertDto.convertToLogin(loginDto);
		log.info("LOGING USER WITH INPUT CREDENTIALS");
		userLoginStatus = loginService.getLoginUser(login);
	    return new ResponseEntity<>(userLoginStatus,HttpStatus.OK);	
	}
	
//	@RequestMapping(value="addBlog", method = RequestMethod.POST)
//	public void addBlog(@RequestBody BlogDto blogDto) {
//		
//	}
	
}
