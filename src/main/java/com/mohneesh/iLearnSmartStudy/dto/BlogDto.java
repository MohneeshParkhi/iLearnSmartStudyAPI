package com.mohneesh.iLearnSmartStudy.dto;

import java.sql.Blob;

import com.mohneesh.iLearnSmartStudy.models.User;

public class BlogDto {
	
	public User user;
	
	public String blogTitle;
	
	public Blob blogBody;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public Blob getBlogBody() {
		return blogBody;
	}

	public void setBlogBody(Blob blogBody) {
		this.blogBody = blogBody;
	}

	public BlogDto(User user, String blogTitle, Blob blogBody) {
		super();
		this.user = user;
		this.blogTitle = blogTitle;
		this.blogBody = blogBody;
	}

	public BlogDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
