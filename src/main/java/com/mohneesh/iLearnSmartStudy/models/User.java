package com.mohneesh.iLearnSmartStudy.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"createdAt","updatedAt"}, allowGetters=true)
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@NotBlank
	@Column(name="email")
	public  String email;
	
	@NotBlank
	@Column(name="password")
	public String password;
	
	
	@NotBlank
	@Column(name="username")
	public String username;
	
	
	@Column(nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedDate;
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", username=" + username + "]";
	}
	public User(String email, String password, String username) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
