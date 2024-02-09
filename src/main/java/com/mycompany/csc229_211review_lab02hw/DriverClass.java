package com.mycompany.csc229_211review_lab02hw;
// Importing Scanner for inputs
import java.util.Scanner;
/**
 *
 * @author Dylan Mejia
 */
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class

		// Creating scanner object
		Scanner scnr = new Scanner (System.in);
		Student std1= new Student("James", (short) 20);
		// Input Message
		System.out.println("Enter the GPA: ");
		double GPA = scnr.nextDouble();


		// ToDo 8: Set the gpa of the student using the scanner and user
		//  input and then print the output.
		// Sets values for Name Age and GPA
		std1.setName("James");
		std1.setAge((short)20);
		std1.setGPA(GPA);

		// Prints Information
		System.out.println(std1);

		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}