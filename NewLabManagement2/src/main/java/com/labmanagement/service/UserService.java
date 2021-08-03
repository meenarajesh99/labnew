package com.labmanagement.service;

/*class to implement methods for CRUD operations from the user repository */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labmanagement.entity.User;
import com.labmanagement.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
		
	}
	
	public void save(User user) {
		user.setUsername(user.getUsername());
		user.setPassword(user.getPassword());
		userRepo.save(user);
		
	}
	
	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}


	

	
	

}
