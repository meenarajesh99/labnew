package com.springboot.labnew.service;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.labnew.entity.Role;
import com.springboot.labnew.entity.User;
import com.springboot.labnew.repository.RoleRepository;
import com.springboot.labnew.repository.UserRepository;
import com.springboot.labnew.utilities.Constants;


@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        User admin = null;
        try {
        	admin = userRepo.findById(1).get();
        }
        catch(NoSuchElementException e)
        {
        	user.setRoles(new HashSet<>(roleRepo.findAll()));
        	System.out.println(user);
        }
        if(admin !=null) {
        	Set<Role> setUserRole = new HashSet<>();
        	setUserRole.add(roleRepo.findRoleByName(Constants.USER));
        	user.setRoles(setUserRole);
        }
                
        
        userRepo.save(user);
    }
    
//    @Override
//    public void save(User user) {
//    	user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//    	user.setRoles(new HashSet<>());
//    	user.addRole(roleRepo.findById(Constants.USER_ROLE_ID).get());
//    	if(user.isAdmin()) {user.addRole(roleRepo.findById(Constants.ADMIN_ROLE_ID).get());}
//    	userRepo.save(user);
//    	
//    }
    
//    public User findById(long id) {
//    	return userRepo.findById(id).get();
//    }

    
    
    @Override
    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }



		

	@Override
	public void saveRoles() {
		List<Role> list =  roleRepo.findAll();
		Role role1 = new Role();
		role1.setName(Constants.ADMIN_);
		
		Role role2 = new Role();
		role2.setName(Constants.USER);
		if(!list.contains(role1))
		{
			roleRepo.save(role1);
		}
		if(!list.contains(role2))
		{
			roleRepo.save(role2);
		}
		
	}


}
