package com.hustlecrafts.spring.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//create a new student object
		Student student = new Student();
		
		//add student object to the model
		model.addAttribute("student", student);
		
		// add the country options to the model 
	    model.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form3";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("The student: " + student.getFirstName());
		
		return "student-confirmation";
	}
}
