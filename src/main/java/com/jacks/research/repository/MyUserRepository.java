package com.jacks.research.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;

import com.jacks.research.model.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Integer> {

	UserDetails findByUsername(String username);
	
	@Query("select u from MyUser u where u.firstName = :#{#c.firstName}")
	List<MyUser> findUsersByCustomersFirstname(@Param("c") MyUser customer);
}
