package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName = "Enter the first name";
	private String lastName = "Enter the last name";
	private String country;
	private String favouriteLanguage;
	
	private String[] experties;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazle");
		countryOptions.put("BD", "Bangladesh");
		countryOptions.put("IN", "India");
		countryOptions.put("JP", "Japan");
		countryOptions.put("UK", "England");
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getExperties() {
		return experties;
	}

	public void setExperties(String[] experties) {
		this.experties = experties;
	}
	
	

}
