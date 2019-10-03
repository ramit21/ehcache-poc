package com.ramit.ehcache.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramit.ehcache.model.Users;
import com.ramit.ehcache.repository.UsersRepository;

@Component
public class Loader {
	
	@Autowired
	UsersRepository usersRepository;
	
	@PostConstruct
	@Transactional
	public void loadData() {
		System.out.println("Loading data into DB");
		List<Users> userList = new ArrayList<>();
		userList.add(new Users("Ramit", "IT", 2000L));
		userList.add(new Users("Santa", "PS", 3000L));
		userList.add(new Users("Clause", "PS", 1000L));
		usersRepository.saveAll(userList);
	}
}
