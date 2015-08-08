package com.java.lesson.anoserLesson;

public class MyExtention extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyExtention() {
		super();
		System.out.println("ALARM!!!");		
	}

	public MyExtention(String message) {
		super(message);
		System.out.println("ALARM!!! " +  message);
	}

	public MyExtention(Throwable cause) {
		super(cause);
	}

	public MyExtention(String message, Throwable cause) {
		super(message, cause);
	}

	public MyExtention(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
