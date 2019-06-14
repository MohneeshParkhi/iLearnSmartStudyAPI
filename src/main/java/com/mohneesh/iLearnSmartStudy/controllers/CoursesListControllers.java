package com.mohneesh.iLearnSmartStudy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohneesh.iLearnSmartStudy.dto.CoursesDTO;
import com.mohneesh.iLearnSmartStudy.modelMapper.ConvertDtoToModal;
import com.mohneesh.iLearnSmartStudy.models.Courses;
import com.mohneesh.iLearnSmartStudy.service.CoursesService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CoursesListControllers {

	@Autowired
	ConvertDtoToModal convertDto;
	
	@Autowired
	CoursesService courseService;
	
	
	@RequestMapping(name="/savelevelLearning", method=RequestMethod.POST)
	ResponseEntity<?> saveCourses(@RequestBody CoursesDTO courseDto){
		Courses course = convertDto.convertToCourse(courseDto); 
		Courses cObject = courseService.saveCourse(course);
		if(cObject != null)
		return new ResponseEntity<Courses>(HttpStatus.OK);
		else
		return new ResponseEntity<Courses>(HttpStatus.BAD_REQUEST);	
	} 
	
}
