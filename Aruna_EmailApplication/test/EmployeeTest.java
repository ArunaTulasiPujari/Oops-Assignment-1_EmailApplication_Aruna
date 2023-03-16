package com.greatlearning.javafsd.emailapplication.test;

import com.greatlearning.javafsd.emailapplication.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee ("Aruna", "Pujari", "Technical");
		//Defining Employee and Department
		
		employee.setFirstName("Aruna");
		System.out.println(employee.getFirstName() + "\t" + employee.getLastName() + "\t" + employee.getDepartment());
		
	}
	
	
	
}
