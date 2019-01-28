package com.luv2code.springMVC.demo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		theModel.addAttribute("customer", new Customer()); 
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer")Customer customer,
			BindingResult theBindingResult){
		if(theBindingResult.hasErrors()){
			return "customer-form";
		}
		return "customer-confirmation";
	}
	@InitBinder
	public void initBinder(WebDataBinder webBinder){
		System.out.println("Inside initBinder");
		StringTrimmerEditor trim = new StringTrimmerEditor(true);
		webBinder.registerCustomEditor(String.class, trim);
		/*Note:  InitBinder is the act as Pre-processor, for every incoming web request.
		 * StringTrimmerEditor is Spring API which will trill all tailring whiteSpace. if String contains only white space then it resulting will be as null. Apply this CustomEditor to the String class*/
		
	}
}
