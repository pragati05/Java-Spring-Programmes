package com.javaDemo;

public class Student {

	public String firstName;
	public String lastName;
	public boolean goldenCustomer;
	
	
	public Student(String firstName, String lastName, boolean isGoldenCustomer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.goldenCustomer = isGoldenCustomer;
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
	public boolean isGoldenCustomer() {
		return goldenCustomer;
	}
	public void setGoldenCustomer(boolean isGoldenCustomer) {
		this.goldenCustomer = isGoldenCustomer;
	}
	
	
	
	
}
