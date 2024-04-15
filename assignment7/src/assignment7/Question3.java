//Q3. write a java program to count number of words in a String.
//Hint: You can use , trim() , length() and split() methods
package assignment7;

import java.util.Scanner;
public class Question3 {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string::");
		String s;
		s=sc.next();
		String [] s2=s.split("  ");
		for(String string:s2) {
			System.out.println("Number of words in String using split::"+string);
		
		}	
		System.out.println("Number of words in String using trim::"+s.trim());
		System.out.println("Number of words in String using length::"+s.length());
		
	}
}
