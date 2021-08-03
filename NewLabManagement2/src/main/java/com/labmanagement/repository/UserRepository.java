package com.labmanagement.repository;

/* class responsible for providing CRUD operations on Testing table in the database */


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.labmanagement.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	@Query("Select u FROM User u where username=?1")
	User findByUsername(String username);
	


}
