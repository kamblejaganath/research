package com.jacks.research.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jacks.research.model.MyUser;
import com.jacks.research.services.UserService;


@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public MyUser saveUser(@RequestBody MyUser user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<MyUser> getUsers(@RequestParam(required = false) String pageNumber, String pageSize, String role, String status) {
        return userService.findAll(pageNumber, pageSize, role, status);
    }

}
