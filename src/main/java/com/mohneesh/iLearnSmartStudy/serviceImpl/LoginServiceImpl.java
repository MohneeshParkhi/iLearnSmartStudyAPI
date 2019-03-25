package com.mohneesh.iLearnSmartStudy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.exceptions.UserNotExistException;
import com.mohneesh.iLearnSmartStudy.models.Login;
import com.mohneesh.iLearnSmartStudy.models.User;
import com.mohneesh.iLearnSmartStudy.repository.RegistrationRepository;
import com.mohneesh.iLearnSmartStudy.service.LoginService;

/**
 * 
 * @author mohneesh
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private RegistrationRepository registrationRepo;
	
	private String email;
	
	private boolean checkUserExist(String email) {
		boolean retUser = registrationRepo.findByEmail(email).isPresent();
		return retUser;
	}
	
	@Override
	public boolean getLoginUser(Login login) throws UserNotExistException{
		email = login.getEmail();
		boolean status = this.checkUserExist(email);
		
		if(status == false)
			throw new UserNotExistException("User does not exist, Please Register yourself");
		else
		return  status;
	}

}
