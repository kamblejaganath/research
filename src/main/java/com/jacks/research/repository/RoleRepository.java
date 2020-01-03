package com.jacks.research.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacks.research.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRoleId(long id);
}
