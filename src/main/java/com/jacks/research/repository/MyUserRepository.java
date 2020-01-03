package com.jacks.research.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacks.research.model.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Integer> {

}
