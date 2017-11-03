package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.User;
import com.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	  UserRepository repository;
	 

	  public List<User>  getall()
	  {
		   return repository.findAll();
		   
	  }
	  

}
