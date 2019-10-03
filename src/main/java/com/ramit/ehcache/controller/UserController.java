package com.ramit.ehcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ramit.ehcache.cache.UsersCache;
import com.ramit.ehcache.model.Users;

@Controller
@RequestMapping(value="/rest/search")
public class UserController {
	
	@Autowired
	UsersCache usersCache;
	
	@GetMapping(value = "/{name}")
	@ResponseBody
	public Users getUser(@PathVariable final String name) {
		return usersCache.getUser(name);
	}
}
