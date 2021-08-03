package com.labmanagement.repository;

/* class responsible for providing CRUD operations on Testing table in the database */

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.labmanagement.entity.Customer;
import com.labmanagement.entity.Testing;

@Repository
public interface TestingRepository extends CrudRepository <Testing, Long> {

	@Query(value="SELECT t FROM Testing t WHERE t.testName LIKE '%' || :keyword || '%' ")
	public List<Testing> search(@Param("keyword") String keyword);

	public List<Customer> findByTestName(String testName);
	
	List<Testing> findByTestId(Long testId);
	

	

}

