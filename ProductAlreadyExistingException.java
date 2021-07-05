package com.abc.techstore.exception;

public class ProductAlreadyExistingException extends RuntimeException {

	private String message ;
	
	public ProductAlreadyExistingException(String msg) {
		super(msg);
		this.message = msg;
	}

}