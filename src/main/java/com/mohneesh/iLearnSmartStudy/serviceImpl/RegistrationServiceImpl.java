package com.mohneesh.iLearnSmartStudy.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.models.User;
import com.mohneesh.iLearnSmartStudy.repository.RegistrationRepository;
import com.mohneesh.iLearnSmartStudy.service.RegistrationService;
import com.mohneesh.iLearnSmartStudy.utilityClasses.DateUtility;

@Service
public class RegistrationServiceImpl implements RegistrationService{
     
	@Autowired
	 private RegistrationRepository registrationRepo;

	 private Date createDate;  
	 
	 private Date updatedDate;
	 
	 @Autowired
	 private DateUtility dateUtility;
	 
	 
	 public void registerUser(User user){
		createDate = dateUtility.getCreateDate();
		updatedDate = dateUtility.getUpdatedDate();
	
		user.setCreateDate(createDate);
		user.setUpdatedDate(updatedDate);
		
		registrationRepo.save(user);
 }
}
