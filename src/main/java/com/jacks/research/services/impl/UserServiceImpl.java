package com.jacks.research.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jacks.research.model.MyUser;
import com.jacks.research.repository.MyUserRepository;
import com.jacks.research.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final MyUserRepository myUserRepository; 
	
	@Override
	public MyUser saveUser(MyUser user) {
		return myUserRepository.save(user);
	}

	@Override
	public List<MyUser> findAll(String pageNumber, String pageSize, String role, String status) {
		return myUserRepository.findAll();
	}

}
