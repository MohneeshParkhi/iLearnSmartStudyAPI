package com.mohneesh.iLearnSmartStudy.serviceImpl;

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

	public void registerUser(User user) throws NonUniqueResourceException {
		
		User retrievedUser = registrationRepo.findByEmail(user.getEmail())
				.orElseThrow(() -> new NonUniqueResourceException("Email ALready Exists"));

	
		User persistedUser = registrationRepo.save(user);
	}
}
