package com.springboot.labnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.springboot.labnew.entity.Testing;




public interface TestingRepository extends CrudRepository <Testing, Long> {
	
	@Query(value="SELECT t FROM Testing t WHERE t.testName LIKE '%' || :keyword || '%' ")
	public List<Testing> search(@Param("keyword") String keyword);

	
	
	List<Testing> findByTestId(Long testId);
	

}
