package com.example.exceptions;

public class CommandCreationException extends Exception {

	private static final long serialVersionUID = 1L;

	public CommandCreationException() {
    }

    public CommandCreationException(String aMessage) {
        super(aMessage);
    }	
	
}