package com.revature.doNotDivideBy42;

public class DivideBy42Exception extends ArithmeticException {
	public String getMessage() {
		return "!!!WARNING: DIVISION BY 42 DETECTED!!!";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
