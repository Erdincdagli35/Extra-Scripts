package com.ed.threadMain;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN THREAD IS INTIALIZED");
		System.out.println("HELLO \n");
		
		Printer printer = new Printer("Printer 1");
		Printer printer2 = new Printer("Printer 2");
		
		printer.start();
		printer2.start();
		
		System.out.println("\nBYE");
	}

}
