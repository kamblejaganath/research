package com.jacks.research.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacks.research.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRoleId(long id);
	
	List<Role> findAll();
}
