package com.labmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.labmanagement.entity.Customer;
import com.labmanagement.entity.Testing;
import com.labmanagement.service.CustomerService;
import com.labmanagement.service.TestingService;

/*class which uses annotations to express request mappings, request input related to the Customer entity*/

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private TestingService testingService;
    
  
    /* maps the customer class with the specified URL name*/
    
    @RequestMapping()
    public ModelAndView home() {
        List<Customer> listCustomer = customerService.listAll();
        ModelAndView mav = new ModelAndView("customer_index");
        mav.addObject("listCustomer", listCustomer);
        return mav;
    }
    
    /* method to access an existing attribute in the model*/
    
    @ModelAttribute("customer")
    public Customer setupCustomer() {
    	return new Customer();
    }
    
    @RequestMapping("/new")
    public String newCustomerForm() {
        return "new_customer";
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") Customer customer) 
    {
        customerService.save(customer);
        return "redirect:/";
    }
  

    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateCustomer(@RequestParam("custID") Long i,@ModelAttribute("customer")Customer customer) 
    {
    	System.out.println("update handler"+i);
        customerService.update(i,customer);
        
       
        return "redirect:/";
    }
    
    @RequestMapping("/edit")
    public ModelAndView editCustomerForm(@RequestParam Long custID) {
    	System.out.println("hello edit"+custID);
        ModelAndView mav = new ModelAndView("edit_customer");
        Customer customer = customerService.get(custID);
         mav.addObject("customer", customer);
        
        return mav;
    }

        
    @RequestMapping("/delete")
    public String deleteCustomerForm(@RequestParam Long custID) {
        customerService.delete(custID);
        return "redirect:/customer/";       
    }
    
    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String keyword) 
    {
    	System.out.println(keyword);
        List<Customer> result = customerService.search(keyword);
       ModelAndView mav = new ModelAndView("search_customer");
       mav.addObject("result", result);
     
        return mav;    
    }
    
   
    @RequestMapping("/assign")
    public String assignCustomerForm(@RequestParam Long custID, Model model) {
        model.addAttribute("customer", customerService.get(custID));
        List<Testing> testList = testingService.listAll();
        model.addAttribute("testList", testList);
        
        return "testing_assign";  
        
    }
    


    @RequestMapping("/assign_test_to_cust")
    public String assignTestToCust(@RequestParam long custID, @RequestParam long testId) {
    		System.out.println("HELLO");
         List<Testing> testing= customerService.assignTesting(custID, testId);
         ModelAndView mav = new ModelAndView("assign_test_customer");
         mav.addObject(testing);
      
         return "redirect:/customer/search?keyword=custName";

    }
    
   
    

  
    
    
}

