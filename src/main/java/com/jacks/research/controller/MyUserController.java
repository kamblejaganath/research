package com.jacks.research.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jacks.research.model.MyUser;
import com.jacks.research.repository.MyUserRepository;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MyUserController {

	private final MyUserRepository myUserRepository;

	@PostMapping()
	@ApiOperation(value = "Authenticate user")
	public void myuser(@RequestBody @Valid MyUser myUser) {
		System.err.println(myUser);
		myUserRepository.save(myUser);
	}

	@GetMapping("/acb")
	@ApiOperation(value = "Authenticate user")
	public List<MyUser> getFind() {
		return myUserRepository.findUsersByCustomersFirstname(new MyUser());
	}
}
