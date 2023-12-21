package com.example.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Add new student");
		boolean isRunning = true;
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Simon", "Götgatan78", 11680));
		students.add(new Student("Phille", "Götgatan78", 11680));
		students.add(new Student("Simon", "Götgatan78", 11680));
		
		for(int i = 0; i < students.size(); i++) {
			for(int j = i + 1; j < students.size(); j++) {
				if(!students.get(i).equals(students.get(j))) {
					System.out.printf("""
							Missmatch found!
							index %d and %d
							Object1: %s
							Object2: %s
							""",i,j, students.get(i), students.get(j));
				}else {
					System.out.printf("""
							Match found!!
							index %d and %d
							Object:1 %s
							Object:2 %s
							""",i,j, students.get(i), students.get(j));
				}
			}
		}
			
		System.out.print("Enter the name of the new student: ");
		String newName = scanner.nextLine();
		System.out.print("Enter the address of the new student: ");
		String newAddress = scanner.nextLine();
		System.out.print("Enter the student postcode of the new student: ");
		int newStudentID = scanner.nextInt();
		students.add(new Student(newName, newAddress, newStudentID));
		System.out.printf("""
				Student added
				Student: %s
				""", students.get(students.size() - 1));
		
		for (int k = 0; k < students.size() - 1; k++) {
			if (students.get(students.size() - 1).equals(students.get(k))) {
				System.out.printf("""
                        Dublicate found!
                        Index %d and %s
                        Object1: %s
                        Object2: %s
                        """, k, (students.size() - 1), students.get(k), students.get(students.size() - 1));
			}
		}
		
		
	}

}
