package com.ed.thread3;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THREAD-3 IS INTIALIZED");
		System.out.println("HELLO \n");
		
		new Thread(new Runnable()
				{
					@Override
					public void run() {
						System.out.println("MY First Thread");
						String[] array= {"E","R","D","Ý","N","Ç"};
						for (int i = 0; i < array.length; i++) {
							System.out.print(array[i]);
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println("\nIT's Done");
						
					}
				}).start();
		
		System.out.println("\nBYE");
	}

}
