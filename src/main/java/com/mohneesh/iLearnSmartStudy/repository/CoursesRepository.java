package com.mohneesh.iLearnSmartStudy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohneesh.iLearnSmartStudy.models.Courses;

@Repository
public interface CoursesRepository  extends JpaRepository<Courses, Long>{

	
	
}
