package com.springboot.labnew.service;



import com.springboot.labnew.entity.User;


public interface UserService {
    void save(User user);

    User findByUsername(String username);
    
    void saveRoles();

	
}

	
