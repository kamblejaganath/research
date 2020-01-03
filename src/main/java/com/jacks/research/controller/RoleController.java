package com.jacks.research.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacks.research.model.Role;
import com.jacks.research.repository.RoleRepository;

@RestController
@RequestMapping(path = "/api")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/addRoleByUserId/{userId}/{roleId}")
    public Role addRoleByUserId(@PathVariable(value = "userId") long userId, @PathVariable(value = "roleId") long roleId) {
        try {
            return roleRepository.findByRoleId(roleId);
        } catch (Exception Ex) {
            return null;
        }
    }

}
