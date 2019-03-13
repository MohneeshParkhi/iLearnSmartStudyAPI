package com.mohneesh.iLearnSmartStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohneesh.iLearnSmartStudy.models.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Long>{

}
