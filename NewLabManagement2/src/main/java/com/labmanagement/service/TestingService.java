package com.labmanagement.service;

/*class to implement methods for CRUD operations from the testing repository */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.labmanagement.entity.Testing;
import com.labmanagement.repository.TestingRepository;


	
	@Service
	public class TestingService {
	    @Autowired TestingRepository testRepo;
	    
	    
	     
	    public List<Testing> listAll() {
	        return (List<Testing>) testRepo.findAll();
	    }
	    
	    public void save(Testing testing) {
	        testRepo.save(testing);
	    }
	     
	    public Testing get(Long testId) {
	        return testRepo.findById(testId).get();
	    }
	     
	    @Transactional
	    public void delete(Long id) {
	        testRepo.deleteById(id);
	    }



		public List<Testing> search(Long testId) {
			return testRepo.findByTestId(testId);
		}
		
		@Transactional
		public void update(Testing testing, Long i) {
			 
	//		   		System.out.println(Status.STATUS1);
			    	System.out.println(testing.getTestId());
			    	System.out.println(testing.getTestName());
			    	Testing testing1 = testRepo.findById(i).get();
			    	
			        testing1.setTestName(testing.getTestName());
			    	
		}



	

	
}
