package com.tester;

import java.util.Scanner;

import com.exception.ExceptionLineTooLong;
import com.entity.StringLength;

public class tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringLength st = new StringLength();
		System.out.println("Enter the string:");
		try {
			st.setLength(sc.next());
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		System.out.println("Program executed successfullly");
	}

}