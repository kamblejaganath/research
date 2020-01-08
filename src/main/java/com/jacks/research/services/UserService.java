package com.jacks.research.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.jacks.research.model.MyUser;

public interface UserService extends UserDetailsService {

	MyUser saveUser(MyUser user);

	List<MyUser> findAll(String pageNumber, String pageSize, String role, String status);
}

