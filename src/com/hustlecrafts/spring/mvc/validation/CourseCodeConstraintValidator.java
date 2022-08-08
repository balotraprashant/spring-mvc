package com.hustlecrafts.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = true;
		
		if(courseCode!=null) {
			result = courseCode.startsWith(coursePrefix);
		}
		
		return result;
	}
	
}
