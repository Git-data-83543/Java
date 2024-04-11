//Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
//strings is too long". Write a program that reads a String from user and calculates its length. and
//throws an exception of type ExceptionLineTooLong in the case where a string of length is more
//than 80 characters.
//(Hint- Use String class length() method)

package com.entity;

import com.exception.ExceptionLineTooLong;

public class StringLength {

	String s;

	public StringLength() {
	}

	public StringLength(String s) {
		this.s = s;
	}

	public void setLength(String s) throws ExceptionLineTooLong {
		if (s.length() > 80)
			throw new ExceptionLineTooLong("The String is too long");
		this.s = s;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "String--> " + s;
	}

}