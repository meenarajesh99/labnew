package com.springboot.labnew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/user")
	public String user() {
		return "welcome";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "welcome";
	}
	
//	@RequestMapping({"/","","/index"})
//	public String home()
//	{
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (!(auth instanceof AnonymousAuthenticationToken))
//            return "redirect:/customer_index";
//		return "index";
//	}

}
