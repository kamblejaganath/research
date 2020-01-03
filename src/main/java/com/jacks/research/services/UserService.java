package com.jacks.research.services;

import java.util.List;

import com.jacks.research.model.MyUser;

public interface UserService {

	MyUser saveUser(MyUser user);

	List<MyUser> findAll(String pageNumber, String pageSize, String role, String status);
}

