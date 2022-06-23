package com.revature.doNotDivideBy42;

public class DividorManager {
public static void main(String[] args) {
	Dividor d = new Dividor();
	try {
		System.out.println("Welcome to the Divide By Anything But 42 Program!");
		d.divide(200, 42);
	}
	catch(DivideBy42Exception e){
		System.out.println("Testing for Division By 42");
		System.out.println(e.getMessage());
		System.out.println("DEFILER..... LEAVE NOW AND FOREVER BE HAUNTED BY YOUR ACTIONS");
	}
	finally {
		System.out.println("...");
		System.out.println("Goodbye, thank you for using the Divide By Anything But 42 Program");
	}
}
}
