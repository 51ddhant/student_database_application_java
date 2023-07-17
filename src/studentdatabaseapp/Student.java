package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	
	// Cost per course
	private static int costOfCourse = 600;
	
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Student's First Name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student's Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freashmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student's Class Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		this.studentID = gradeYear + "" + id;
		id++;
		
	}
	
	// Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n\t" + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
		} while(1!=0);
		System.out.println("Tuition Balance: " + tuitionBalance);
	}
	
	// View balance
	public void viewBalance(){
		System.out.println("Your Balance is: $" + tuitionBalance);
		
	}
	// Pay tuition
	public void payTuition() {
		System.out.print("Enter Your Payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance-=payment;
		System.out.println("Thank You for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "Student Id: " + studentID + "\nName: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear +  "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;  
	}
}
