package com.ramit.ehcache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramit.ehcache.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);
	
}
