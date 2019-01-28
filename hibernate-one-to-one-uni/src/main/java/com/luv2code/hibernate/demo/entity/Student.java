package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
 * Step 1:  Map the Student class to the Database table using @Entity and
 *  by default name of the Table will be class name, 
 *  but if you want to give explicitly , you can give using @Table annotation
 *  */

@Entity
@Table(name = "student")
public class Student {

	/*
	 * Step 2: Map the Fields to Database Column
	 * 
	 * @Id indicate Primary Key of the table ,
	 * 
	 * @Column we can give explicitly name to the DB column otherwise it will the
	 * same is variable name
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;

	@Column(name = "first_name", length = 10)
	String firstName;

	@Column(name = "last_name")
	String lastName;

	/* By defaukt it will ne "email" only */
	@Column(name="email")
	String email;

	/* Default Constructor */
	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
/*For Debugging Purpose*/
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	
	
}
