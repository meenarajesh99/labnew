package com.labmanagement.repository;


/* class responsible for providing CRUD operations on Customer table in the database */

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.labmanagement.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	
    @Query(value="SELECT c FROM Customer c WHERE c.custName LIKE '%' || :keyword || '%'"
    		+ " OR c.custDOB LIKE '%' || :keyword || '%'"
            + " OR c.email LIKE '%' || :keyword || '%'"
            + " OR c.address LIKE '%' || :keyword || '%'"
            + " OR c.city LIKE '%' || :keyword || '%'"
            + " OR c.state LIKE '%' || :keyword || '%'"
            + " OR c.zipcode LIKE '%' || :keyword || '%'"
    		)
 
    public List<Customer> search(@Param("keyword") String keyword);
    
    public Customer findByCustName(String custName);
    
   
	

}










