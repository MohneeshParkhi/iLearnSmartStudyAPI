package com.mohneesh.iLearnSmartStudy.service;

import com.mohneesh.iLearnSmartStudy.exceptions.NonUniqueResourceException;
import com.mohneesh.iLearnSmartStudy.models.User;

public interface RegistrationService {

	public void registerUser(User user) throws NonUniqueResourceException;

}
