package com.exception;

public class ExceptionLineTooLong extends Exception {

	private String field;
	private String message;

	public ExceptionLineTooLong() {
		field = "";
		message = "";
	}

	public ExceptionLineTooLong(String message) {
		super();
		this.message = message;
	}

	public ExceptionLineTooLong(String field, String message) {
		this.field = field;
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.err.println("Exception");
		System.err.println("ExceptionLineTooLong::" + message);
		System.err.println("Field: " + field);
	}

}