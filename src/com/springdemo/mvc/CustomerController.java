package com.springdemo.mvc;


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
	
	//add initBinder
	//initiate the Stream Editor
	//resolve the validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor myStringTrimmerEditor = new StringTrimmerEditor(true) ;
		
		dataBinder.registerCustomEditor(String.class, myStringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult
			) {
		System.out.println(theBindingResult);
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}

}
