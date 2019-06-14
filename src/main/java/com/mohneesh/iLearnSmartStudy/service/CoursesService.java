package com.mohneesh.iLearnSmartStudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohneesh.iLearnSmartStudy.models.Courses;
import com.mohneesh.iLearnSmartStudy.repository.CoursesRepository;

@Service
public interface CoursesService {
	
	
	public Courses saveCourse(Courses course);
}
