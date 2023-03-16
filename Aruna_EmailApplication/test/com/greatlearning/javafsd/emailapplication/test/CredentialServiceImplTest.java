package com.greatlearning.javafsd.emailapplication.test;

import com.greatlearning.javafsd.emailapplication.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapplication.Employee;
import com.greatlearning.javafsd.emailapplication.PasswordGenerator;

public class CredentialServiceImplTest {

	public static void main(String[] args) {
		
		testEmailAddressGeneration();
		testPasswordGeneration();
		testDisplayCredentials();
				
	}
		
	static void testEmailAddressGeneration() {
		
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		
		Employee employee = new Employee ("Aruna", "Pujari", "technical");
		
		String emailAddress = serviceImpl.generateEmailAddress(employee);
		
		System.out.println(emailAddress);
				
	}
	
	static void testPasswordGeneration() {
	
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		
		String password = serviceImpl.generatePassword();
		System.out.println("Password -->" + password);
			
	}
	
	static void testDisplayCredentials() {
		
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		
		Employee employee = new Employee ("Aruna", "Pujari", "technical");
		
		serviceImpl.generateEmailAddress(employee);
		String password = serviceImpl.generatePassword();
		employee.setPassword(password);
		
		serviceImpl.displayCredentials(employee);
		
		
	}
	
}
