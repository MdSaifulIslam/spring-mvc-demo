package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsDoSomeExtra(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = "Yo! " + theName.toUpperCase();
		
		model.addAttribute("message", theName);
		
		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(

			@RequestParam("studentName") String theName, Model model) {

		theName = "Yo! It's V3:  " + theName.toUpperCase();

		model.addAttribute("message", theName);

		return "helloworld";
	}
}
