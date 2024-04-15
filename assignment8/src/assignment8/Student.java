//Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
//display students
//1. sorted on their city (asc)
//2. sorted on their on marks (desc)
//3. sorted on their on name (asc)

package assignment8;

import java.util.*;

public class Student implements Comparable<Student> {
	 int roll;
	 String name;
	String city;
	 double marks;

	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll-->");
		roll = sc.nextInt();
		System.out.println("Enter the name-->");
		name = sc.next();
		System.out.println("Enter the city-->");
		city = sc.next();
		System.out.println("Enter the marks-->");
		marks = sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {

		return (int) (this.marks - o.marks);
	}
	

}
