package com.mohneesh.iLearnSmartStudy.serviceImpl;

import java.util.NoSuchElementException;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.exceptions.NonUniqueResourceException;
import com.mohneesh.iLearnSmartStudy.models.User;
import com.mohneesh.iLearnSmartStudy.repository.RegistrationRepository;
import com.mohneesh.iLearnSmartStudy.service.RegistrationService;

/**
 * 
 * @author mohneesh
 *
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepo;
	
	
	
	private boolean getUser(User user) throws NoSuchElementException{
		boolean retUser = registrationRepo.findByEmail(user.getEmail()).isPresent();
		return retUser;
	}
	

	public void registerUser(User user) throws NonUniqueResourceException, NoSuchElementException {
	
		boolean us = this.getUser(user);
		System.out.print(us);
		if(us) {
			throw new NonUniqueResourceException("Resource existed");
	
		}else {
			User persistedUser = registrationRepo.save(user);
		}
	}
}
