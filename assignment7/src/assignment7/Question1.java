//Q1. Write a java program to reverse a String

package assignment7;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the String--> ");
		s = sc.next();

		StringBuffer sbr = new StringBuffer(s);
		sbr.reverse();
		System.out.println(sbr);

	}
}
