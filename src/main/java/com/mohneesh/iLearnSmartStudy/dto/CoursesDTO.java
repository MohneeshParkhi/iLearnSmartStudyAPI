package com.mohneesh.iLearnSmartStudy.dto;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


public class CoursesDTO {
 
 @Id
 @Column(name="course_id")
 private int id;
 
 
 @Column(name="level_of_learning")
 private String levelOfLearning;
 
 @Column(name="type")
 private String type;
 
 @Lob
 @Column(name="level_of_loarningPic")
 private byte[] picture;

@Override
public String toString() {
	return "CoursesDTO [id=" + id + ", levelOfLearning=" + levelOfLearning + ", type=" + type + ", picture="
			+ Arrays.toString(picture) + "]";
}

public CoursesDTO(int id, String levelOfLearning, String type, byte[] picture) {
	super();
	this.id = id;
	this.levelOfLearning = levelOfLearning;
	this.type = type;
	this.picture = picture;
}

public CoursesDTO() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
 
 
}
