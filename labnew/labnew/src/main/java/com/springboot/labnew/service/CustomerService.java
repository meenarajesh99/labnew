package com.springboot.labnew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.labnew.entity.Customer;
import com.springboot.labnew.entity.Testing;
import com.springboot.labnew.repository.CustomerRepository;
import com.springboot.labnew.repository.TestingRepository;



@Service
public class CustomerService {
	
	@Autowired
    private CustomerRepository repo;
    private TestingRepository testRepo;
    
    
    
    public CustomerService(CustomerRepository repo, TestingRepository testRepo) {
    	this.repo = repo;
    	this.testRepo = testRepo;
    	
    }
    @Transactional
    public void save(Customer customer) {
        repo.save(customer);
    }
    
    public List<Customer>search(String keyword){
    	return repo.search(keyword);
    }
    
    public Customer searchAny(String keyword) {
    	return (Customer) repo.search(keyword);
    }
    
    @Transactional
    public Customer findByCustName(String custName) {
    	Customer customer =  repo.findByCustName(custName);
		return customer;
    }
    
    
    
    @Transactional
    public void delete(Long custID) {
        repo.deleteById(custID);
    }
    
    public List<Customer> listAll() {
    
       List<Customer> lt	=(List<Customer>) repo.findAll();
       for(Customer c:lt)
       {
    	  c.getState();
       }
        return (List<Customer>) repo.findAll();
    }
    
    @Transactional
    public void update(Long i, Customer cust) {
    	
    	System.out.println(i+"update customerservice");
    	
    	cust.setCustId(i);
    	
    	Customer custFound = repo.findById(cust.getCustID()).get();
    	custFound.setCustName(cust.getCustName());
    	custFound.setAddress(cust.getAddress());
    	custFound.setEmail(cust.getEmail());
    	custFound.setCustName(cust.getCustName());
      	custFound.setCustDOB(cust.getCustDOB());
      	custFound.setEmail(cust.getEmail());
      	custFound.setAddress(cust.getAddress());
      	custFound.setCity(cust.getCity());
      	custFound.setState(cust.getState());
      	custFound.setZipcode(cust.getZipcode());
    }
    
	public Customer get(Long custID) {
		
		return repo.findById(custID).get();
	}
	public List<Testing> assignTesting(long custID, long testId) {
		// TODO Auto-generated method stub
		return null;
	}
}
