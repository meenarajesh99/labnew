package com.springboot.labnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springboot.labnew.entity.User;




//@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("Select u FROM User u where username=?1")
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	

	

}
