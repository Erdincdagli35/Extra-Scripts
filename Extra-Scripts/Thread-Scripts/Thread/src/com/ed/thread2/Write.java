package com.ed.thread2;

public class Write implements Runnable {

	private String name;

	public Write(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" is Initialized");
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+"-"+name);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread has stopped ");
			}
		}
		System.out.println(name+" is finished ");
	}
	
}
