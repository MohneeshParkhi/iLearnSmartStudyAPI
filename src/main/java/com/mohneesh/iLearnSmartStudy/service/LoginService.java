package com.mohneesh.iLearnSmartStudy.service;

import com.mohneesh.iLearnSmartStudy.exceptions.UserNotExistException;
import com.mohneesh.iLearnSmartStudy.models.Login;
/**
 * 
 * @author mohneesh
 *
 */
public interface LoginService {

	 String getLoginUser(Login login) throws UserNotExistException;
}
