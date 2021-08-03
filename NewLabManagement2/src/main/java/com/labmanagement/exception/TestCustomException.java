package com.labmanagement.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class TestCustomException {
	
	/*method to handle the CustomException when occurs and to redirect the user to the exceptionPage */
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView  processCustomException(CustomException ce) {
		ModelAndView mav =  new ModelAndView("exceptionPage");
		mav.addObject("name", ce.getName());
		mav.addObject("message", ce.getMessage());
		return mav;
		}
			
}			
		
		
	

		

	


