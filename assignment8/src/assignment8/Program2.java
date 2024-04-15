//Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
//display students
//1. sorted on their city (asc)
//2. sorted on their on marks (desc)
//3. sorted on their on name (asc)

package assignment8;

import java.util.*;
import java.util.Comparator;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[3];

		int choice;

		do {
			System.out.println("0.EXIT!!!");
			System.out.println("1.Accept Student");

			System.out.println("2.Sorted on their city (asc)");
			System.out.println("3. sorted on their on marks (desc)");
			System.out.println("4. sorted on their on name (asc)");
			System.out.println("Enter the choice-->");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You!!!");
				break;

			case 1:
				System.out.println("Accept Values-->");

				for (int i = 0; i < s.length; i++) {
					s[i]=new Student();
					s[i].accept();
				}

				break;
			case 2:
				System.out.println("Before Sorting-->");
				for (Student s1 : s)
					System.out.println(s1);

				class StudentComparator implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.city.compareTo(o2.city);
						return value;
					}
				}
				Comparator<Student> stud = new StudentComparator();

				Arrays.sort(s, stud);
				System.out.println("After Sorting -");
				for (Student s1 : s)
					System.out.println(s1);
				break;

			case 3:
				System.out.println("Before Sorting-->");
				for (Student s1 : s)
					System.out.println(s1);

				class StudentComparator implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						int value = Double.compare(o1.marks, o2.marks);
						return -value;
					}
				}
				Comparator<Student> sc1 = new StudentComparator();

				Arrays.sort(s, sc1);
				System.out.println("After Sorting -");
				for (Student s1 : s)
					System.out.println(s1);
				break;

			case 4:
				System.out.println("Before Sorting-->");
				for (Student s1 : s)
					System.out.println(s1);

				class StudentComparator implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.name.compareTo(o2.name);
						return value;
					}
				}
				Comparator<Student> sc2 = new StudentComparator();

				Arrays.sort(s, sc2);
				System.out.println("After Sorting -");
				for (Student s1 : s)
					System.out.println(s1);

				break;

			default:
				System.out.println("Wrong Choice!!!!");
				break;

			}

		} while (choice != 0);
	}
}
