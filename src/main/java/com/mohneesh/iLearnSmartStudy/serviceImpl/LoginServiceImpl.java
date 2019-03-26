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
	
	private User checkUserExist(String email) {
		User retUser = registrationRepo.findByEmail(email).get();
		return retUser;
	}
	
	@Override
	public String getLoginUser(Login login) throws UserNotExistException{
		email = login.getEmail();
		User retUserCredentials = this.checkUserExist(email);
		boolean status = false;
	
		if(login.getEmail().equals(retUserCredentials.email) 
				&& login.getPassword().equals(retUserCredentials.password)){
			status = true;
		}else {
			status = false;
		}
		if(status== false)
			throw new UserNotExistException("User does not exist, Please Register yourself");
		else
		return  retUserCredentials.email;
	}

}
