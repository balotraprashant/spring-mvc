package com.hustlecrafts.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/studentForm")
	public String showStudentForm() {
		return "student-form";
	}
	
	@RequestMapping("/studentForm2")
	public String showStudentForm2() {
		return "student-form2";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm() {
		return "form-success";
	}
	
	@RequestMapping("letsShoutDude")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		
		String result = "Yo! " + name;
		
		model.addAttribute("message", result);
		return "form-success2";
	}
}
