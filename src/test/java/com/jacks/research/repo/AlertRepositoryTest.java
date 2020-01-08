package com.jacks.research.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.jacks.research.repository.RoleRepository;

@DataJpaTest
public class AlertRepositoryTest {

	@Autowired
	private RoleRepository roleRepository;

	@Test
	void checkThatNotNull() {
		roleRepository.findAll();
	}
}
