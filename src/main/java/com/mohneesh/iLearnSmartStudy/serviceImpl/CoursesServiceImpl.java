package com.mohneesh.iLearnSmartStudy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mohneesh.iLearnSmartStudy.models.Courses;
import com.mohneesh.iLearnSmartStudy.repository.CoursesRepository;
import com.mohneesh.iLearnSmartStudy.service.CoursesService;

public class CoursesServiceImpl implements CoursesService {
	
	@Autowired
	CoursesRepository coursesRepo;

	@Override
	public Courses saveCourse(Courses course) {
		return coursesRepo.save(course);
	}
}
