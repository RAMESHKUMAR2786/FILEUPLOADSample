package com.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.User;
import com.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService service;
	

	@RequestMapping("/all")
	public List<User> all() {
		return service.getall();
	}

}
