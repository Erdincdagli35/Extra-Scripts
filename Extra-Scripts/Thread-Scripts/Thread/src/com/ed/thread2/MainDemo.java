package com.ed.thread2;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THREAD-2 IS INTIALIZED");
		System.out.println("HELLO \n");
		
		Thread write = new Thread(new Write("Write"));
		Thread write2 = new Thread(new Write("Write 2"));
		
		write.start();
		write2.start();
		
		System.out.println("\nBYE");
	}

}
