package com.ipl_fantasy.utils;

public class IncorrectPasswordException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectPasswordException(String msg){
		super(msg);
	}
}
