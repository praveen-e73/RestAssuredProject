package com.restassuredproject.testrunner;

import com.fasterxml.jackson.databind.ObjectMapper; 

public class JSON_Parse { 
	public static void main(String[] args) { 
		String jsonString = "{\"name\": \"John Doe\", \"age\": 30, \"city\": \"New York\"}"; 
		
		try { 
			ObjectMapper objectMapper = new ObjectMapper(); 
			Person person = objectMapper.readValue(jsonString, Person.class); 
			System.out.println("Name: " + person.name); 
			System.out.println("Age: " + person.age); 
			System.out.println("City: " + person.city); 
			//test
			} catch (Exception e) 
		      { 
				e.printStackTrace(); 
			  } 
		} 
	}



	
