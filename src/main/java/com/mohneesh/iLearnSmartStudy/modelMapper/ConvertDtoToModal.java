package com.mohneesh.iLearnSmartStudy.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.dto.CoursesDTO;
import com.mohneesh.iLearnSmartStudy.dto.LoginDto;
import com.mohneesh.iLearnSmartStudy.dto.UserDto;
import com.mohneesh.iLearnSmartStudy.models.Courses;
import com.mohneesh.iLearnSmartStudy.models.Login;
import com.mohneesh.iLearnSmartStudy.models.User;

/**
 * 
 * @author mohneesh
 *
 */
@Service
public class ConvertDtoToModal {
    
	@Autowired
	ModelMapper modelMapper;
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	
	public User convertToEntity(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		return user;
	}
	
	public Login convertToLogin(LoginDto loginDto) {
	Login login = modelMapper.map(loginDto, Login.class);
	return login;
	}
	
	public Courses convertToCourse(CoursesDTO coursesDTO) {
	 return modelMapper.map(coursesDTO, Courses.class);
	}
}
