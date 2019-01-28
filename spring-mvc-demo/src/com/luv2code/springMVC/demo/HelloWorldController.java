package com.luv2code.springMVC.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// Controller level Mapping - Parent Mapping
@RequestMapping("/hello")
public class HelloWorldController {

	
	//Method to show the HTML form
	//Relative Mapping - Sub mapping
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloWorld-form";
	}
	
	//Method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "processForm";
	}
	
	// Fetch data from HTML Page
	@RequestMapping("/processFormVerionTwo")
	public String processFormVerionTwo(HttpServletRequest req , Model model){
		String theName = req.getParameter("studentName");
		theName = theName.toUpperCase() + " V2";
		model.addAttribute("name",theName);
		return "processForm";
		
		
	}
	
	// Using @RequestParam  - fetch the value from HTML page
	
	@RequestMapping("/processFormVerionThree")
	public String processFormVerionThree(
			@RequestParam("studentName") String theName, Model model){
		
		///String theName = req.getParameter("studentName");
		
		theName = theName.toUpperCase() + " V3";
		model.addAttribute("name",theName);
		return "processForm";
		
		
	}
}
