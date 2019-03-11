package com.mohneesh.iLearnSmartStudy.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.dto.UserDto;
import com.mohneesh.iLearnSmartStudy.models.User;

@Service
public class RegistrationDtoConversion {
    
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
}
