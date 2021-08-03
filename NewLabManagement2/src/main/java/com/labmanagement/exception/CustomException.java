package com.labmanagement.exception;

/**
 * Class for custom exceptions which extends RuntimeException 
 */
public class CustomException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	String message;
	String name;
	
	
	public CustomException(String message, String name) {
		super();
		this.message = message;
		this.name = name;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
