package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springdemo.mvc.validator.CourseCode;

public class Customer {
	private String firstName ="111";
	
	@NotNull(message = "* Field Value is Required")
	@Size(min = 1, message = " * is required")
	private String lastName="2222";
	
	@NotNull(message = "* is required [Integer Value]")
	@Min(value = 0, message = "Must be grater or equal to zero (0)")
	@Max(value = 10, message = "Must be less than or equal to ten (10)")
	private Integer freePasses;
	
	@NotNull(message = "Null not allowed")
	@Pattern(regexp = "^[a-zA-z0-9]{5}", message = "Please input string of 5 charecters" )
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
}
