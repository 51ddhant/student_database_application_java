package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		// Ask how many new students do we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int studentCount = sc.nextInt();
		Student[] students = new Student[studentCount];
		
		// Create n number of new students
		for(int i = 0; i<studentCount; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		for(int i = 0; i<studentCount; i++) {
			System.out.println(students[i].toString());
		}
		
	}

}
