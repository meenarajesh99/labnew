package com.springboot.labnew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.labnew.entity.Testing;
import com.springboot.labnew.repository.TestingRepository;


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
		// TODO Auto-generated method stub
		return testRepo.findByTestId(testId);
	}
	
	@Transactional
	public void update(Testing testing, Long testId) {
		 
		Testing testing1 = testRepo.findById(testId).get();
		testing1.setTestName(testing.getTestName());
		    	
	}






}
