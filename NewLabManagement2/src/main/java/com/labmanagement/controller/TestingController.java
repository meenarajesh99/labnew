package com.labmanagement.controller;

/*class which uses annotations to express request mappings, request input related to the Testing entity*/

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.labmanagement.entity.Testing;
import com.labmanagement.service.TestingService;

@Controller
@RequestMapping("/testing")
public class TestingController {
	
	@Autowired
	private TestingService testingService;
	

	
	@RequestMapping()
    public ModelAndView home() {
    List<Testing> testList = testingService.listAll();
    ModelAndView mav = new ModelAndView("testing_index");
    mav.addObject("testList", testList);
	return mav;
    }
	
	@ModelAttribute("testing")
    public Testing setupTesting() {
    	return new Testing();
    }
    
    @RequestMapping("/new")
    public String newTestingForm() {
        return "new_testing";
    }
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveTesting(@ModelAttribute("testing") Testing testing) {
        testingService.save(testing);
        return "redirect:/";
    }
    
    @RequestMapping("/edit")
    public ModelAndView editTestingForm(@RequestParam long testId) {
        ModelAndView mav = new ModelAndView("edit_testing");
        Testing testing= testingService.get(testId);
        mav.addObject("testing", testing);
        return mav;
    }
    

    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateTests(@RequestParam("testId") Long i,@ModelAttribute("testing")Testing testing) {
        	testingService.update(testing,i);
        
        
        return "redirect:/";
    }
    
    @RequestMapping("/delete")
    public String deleteTestingForm(@RequestParam long testId) {
        testingService.delete(testId);
        return "redirect:/testing/";       
    }
    
    @RequestMapping("/search")
    public ModelAndView search(@RequestParam long testId) {
        List<Testing> result = testingService.search(testId);
        ModelAndView mav = new ModelAndView("search_testing");
        mav.addObject("result", result);
        return mav;    
    }

}
