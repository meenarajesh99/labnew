package com.labmanagement.controller;

/*class which uses annotations to express request mappings, request input */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.labmanagement.entity.User;
import com.labmanagement.exception.CustomException;
import com.labmanagement.service.UserService;


@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	
	@ModelAttribute("user")
    public User setupUser() {
    	return new User();
    }
	
	@RequestMapping(value = ("/login"), method = RequestMethod.GET)
	  public String login(Model model) {
		return "login";
	  }

	
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("user", new User());

	    return mav;
	  }


	 /* method to handle POST requests for Registration form and to handle custom exceptions*/
	 
	 @RequestMapping(value= {"/register"}, method= RequestMethod.POST)
	 public String processRegister(@ModelAttribute ("user") User user ) {
		 if(user.getUsername().length()<5) {
			 throw new CustomException("Custom Exception has occured", "CustomException");
		 }
		 
		 userService.save(user);
		 return "success";
	 }
	 
    


//	 @RequestMapping(value = "/success", method = RequestMethod.GET)
//	  public ModelAndView showSuccess(HttpServletRequest request, HttpServletResponse response) {
//	    ModelAndView mav = new ModelAndView("login");
//	    
//	    mav.addObject("user", new User());
//
//	    return mav;
//	  }

}
