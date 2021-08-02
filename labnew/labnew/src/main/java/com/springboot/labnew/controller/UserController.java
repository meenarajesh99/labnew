package com.springboot.labnew.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.labnew.entity.Customer;
import com.springboot.labnew.entity.Testing;
import com.springboot.labnew.entity.User;
import com.springboot.labnew.repository.CustomerRepository;
import com.springboot.labnew.service.CustomerService;
import com.springboot.labnew.service.SecurityService;
import com.springboot.labnew.service.TestingService;
import com.springboot.labnew.service.UserService;
import com.springboot.labnew.validator.UserValidator;



@Controller

public class UserController {
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private TestingService testingService;
	
	@Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    

	
	@GetMapping("/login")
	public String loginPage(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
	
	@GetMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("userForm", new User());
		return "register";
	}
	
	@PostMapping("/register")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "register";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }
	
//	@GetMapping({ "/welcome"})
//    public String welcome() {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		if(!(auth instanceof AnonymousAuthenticationToken))
//			return "redirect:/customer";
//		return "welcome";
//    }
	
//	@RequestMapping("/search")
//    public ModelAndView search(@RequestParam String keyword) {
//       List<Customer> result = customerService.search(keyword);
//       ModelAndView mav = new ModelAndView("search_customer");
//       mav.addObject("result", result);
//     
//        return mav;    
//    }
	
	@GetMapping({"/search"})
	public String search() {
		return "/search_customer";
		
		
	}

	@RequestMapping(value="/search_customer", method=RequestMethod.POST)
	public ModelAndView searchcustomer(@RequestParam String keyword) {
	       Customer result = customerService.searchAny(keyword);
	       ModelAndView mav = new ModelAndView("search_customer");
	       mav.addObject("result", result);
	     
	        return mav;    
	    }
	 @RequestMapping("/edit")
	    public ModelAndView editCustomerForm(@RequestParam Long custID) {
	    	ModelAndView mav = new ModelAndView("edit_customer");
	        Customer customer = customerService.get(custID);
	         mav.addObject("customer", customer);
	        
	        return mav;
	    }
	

	
	@GetMapping({"/welcome"})
	public String welcome() {
		return "/welcome";
		
	}
	
//	@GetMapping("/testing")
//	public String testing() {
//		return "/search_testing";
//	}
	@GetMapping("/testing")
    public ModelAndView home() {
    List<Testing> testList = testingService.listAll();
    ModelAndView mav = new ModelAndView("search_testing");
    mav.addObject("testList", testList);
	return mav;
    }
	
//	@GetMapping("/testing")
//	public String testing() {
//		return "/search_testing";
//	}
	
	

	
	@GetMapping("/access_denied")
	public String accessDenied() {
		return "error/access_denied";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout"; //You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
	



}
