package org.std;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student std=null;
		System.out.println("How Many Student Yoy Want to Store:");
		int stdcount=s.nextInt();
		for(int i=0;i<stdcount;i++) {
			System.out.println("Enter Student "+i+" Name:");
			String name=s.next();
			System.out.println("Enter Total Subjects:");
			int sub=s.nextInt();
			double[]marks=new double[sub];
			for(int j=0;j<sub;j++) {
				System.out.println("Enter "+j+" Subject Marks:");
				marks[j]=s.nextDouble();
			}
			std=new Student(name, sub, marks);
		}
		while(true) {
		System.out.println("Enter \n"
				+ "1.Student Name:\n"
				+ "2.Student Avarage Marks:\n"
				+ "3.Exit:\n");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.println(std.name);
			break;
		case 2:
			System.out.println(std.getAvgMarks());
			break;
		case 3:
			System.out.println("Thank You For using This Application");
			System.exit(ch);
			break;
		default:
		System.out.println("Something went wrong...!!!");
		}
		}
	}
}
