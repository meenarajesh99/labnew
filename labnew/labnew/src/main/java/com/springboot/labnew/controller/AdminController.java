package com.springboot.labnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.labnew.service.CustomerService;
import com.springboot.labnew.service.TestingService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private TestingService testingService;

}
