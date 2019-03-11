package com.mohneesh.iLearnSmartStudy.serviceImpl;

import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.models.User;
import com.mohneesh.iLearnSmartStudy.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{
 
	public void registerUser(User user){
	 System.out.println(user);
 }
}
