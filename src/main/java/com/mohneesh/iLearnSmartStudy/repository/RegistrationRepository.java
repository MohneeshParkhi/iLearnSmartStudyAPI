package com.mohneesh.iLearnSmartStudy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohneesh.iLearnSmartStudy.models.User;

/**
 * 
 * @author mohneesh
 *
 */
@Repository
public interface RegistrationRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

}
