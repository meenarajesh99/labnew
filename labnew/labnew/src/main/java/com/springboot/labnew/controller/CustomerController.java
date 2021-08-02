package com.springboot.labnew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.labnew.entity.Customer;
import com.springboot.labnew.entity.Testing;
import com.springboot.labnew.service.CustomerService;
import com.springboot.labnew.service.TestingService;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private TestingService testingService;
    
//    @Autowired
//    private UserServiceImpl userService;
//    
    @ModelAttribute("customer")
    public Customer setupCustomer() {
    	return new Customer();
    }
    
    @RequestMapping()
    public ModelAndView index() {
    List<Customer> listCustomer = customerService.listAll();
    ModelAndView mav = new ModelAndView("customer_index");
    mav.addObject("listCustomer", listCustomer);
	return mav;
    }
    
    @GetMapping(value="/customer")
    public String customer(ModelMap Model) {
    	return "customer_index";
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
    //	System.out.println("update handler"+i);
        customerService.update(i,customer);
        
       
        return "redirect:/";
    }
    
    @RequestMapping("/edit")
    public ModelAndView editCustomerForm(@RequestParam Long custID) {
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
    public ModelAndView search(@RequestParam String keyword) {
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
         List<Testing> testing= customerService.assignTesting(custID, testId);
         ModelAndView mav = new ModelAndView("assign_test_customer");
         mav.addObject(testing);
      
         return "redirect:/customer/search?keyword=custName";

    }
   
    

  
    
    
}

