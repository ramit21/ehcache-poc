package com.ramit.ehcache.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.ramit.ehcache.model.Users;
import com.ramit.ehcache.repository.UsersRepository;

@Component
public class UsersCache {

	@Autowired
	UsersRepository usersRepository;
	
	@Autowired 
	CacheManager cacheManager;
	
	@Cacheable(value="usersCache", key="#name")  //Cache name as per xml
	public Users getUser(String name) {
		Users user = usersRepository.findByName(name);
		System.out.println("Read from DB, user = "+user);
		return user;
	}

	public void reset() {
		Cache cache = cacheManager.getCache("usersCache");
		cache.clear();
	}
}
