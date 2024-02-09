package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author Dylan Mejia
 */
// Student class extends Person class
// making Student class child of Person class
public class Student extends Person {
	// ToDo 1: Make this class a child of Person
	// Student constructor with name and age as parameters
	// super keyword uses for 2 parameters
	public Student(String name, short age){
		super(name,age);
    }
	// Declaring private variables GPA and address
	private double GPA;
	private String address;

	// Setter and Getter Method for GPA
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	public double getGPA() {
		return GPA;
	}

	// Overriding Abstract Methods from Person.java
	// With Setter and Getter Methods for address
	@Override
	public String getAddress() {
		return address;
	}
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	// Overriding toString method to print information
	@Override
	public String toString() {
		return "Name:" + getName() + " " +
				"Age:" + getAge() + " " +
				"GPA:" + getGPA() +
				".";
	}


	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}