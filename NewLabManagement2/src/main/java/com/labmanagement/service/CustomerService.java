package com.labmanagement.service;

/*class to implement methods for CRUD operations from the customer repository */

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.labmanagement.entity.Customer;
import com.labmanagement.entity.Testing;
import com.labmanagement.repository.CustomerRepository;
import com.labmanagement.repository.TestingRepository;


@Service
public class CustomerService {

    private CustomerRepository repo;
    private TestingRepository testRepo;
    
    
    @Autowired
    public CustomerService(CustomerRepository repo, TestingRepository testRepo) {
    	this.repo = repo;
    	this.testRepo = testRepo;
    	
    }
    @Transactional
    public void save(Customer customer) {
        repo.save(customer);
    }
     
    public List<Customer> listAll() {
    	System.out.println("hello keywork search");
       List<Customer> lt	=(List<Customer>) repo.findAll();
       for(Customer c:lt)
       {
    	  c.getState();
       }
        return (List<Customer>) repo.findAll();
    }
     
    public Customer get(Long custID) {
    	System.out.println("Hello save custid");
        return repo.findById(custID).get();
    }
     
    @Transactional
    public void delete(Long custID) {
        repo.deleteById(custID);
    }
    public List<Customer>search(String keyword){
    	return repo.search(keyword);
    }
    
    @Transactional
	public List<Testing> assignTesting(Long custID, Long testId) {
    	Customer cust = repo.findById(custID).get();
		List<Testing> testing =   testRepo.findByTestId(testId);
		cust.setTesting(testing);
		return testing;
	}
    
    @Transactional
    public Customer findByCustName(String custName) {
    	Customer customer =  repo.findByCustName(custName);
		return customer;
    }

   
  	
    
 /*   @Transactional
    public Customer update(Customer cust)
    
    {
    	
    	System.out.println(cust.getCustID());
    	System.out.println(cust.getAddress());
          Customer customer = repo.findById(i).get();
            
           
    	
     /*   custFound.setCustName(cust.getCustName());
    	custFound.setCustDOB(cust.getCustDOB());
    	custFound.setEmail(cust.getEmail());
    	custFound.setAddress(cust.getAddress());
    	custFound.setCity(cust.getCity());
    	custFound.setState(cust.getState());
    	custFound.setZipcode(cust.getZipcode());*/
	//	return customer;
//}*/
		
	    
    
    	
   
   
	
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

     
}


