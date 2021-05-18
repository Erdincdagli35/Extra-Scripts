import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for (int i = 1; i < 8; i++) {
			executor.submit(new Worker(String.valueOf(i),i));
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		Thread t1 = new Thread(new Worker("Task 1",1));
		Thread t2 = new Thread(new Worker("Task 2",2));
		Thread t3 = new Thread(new Worker("Task 3",3));
		Thread t4 = new Thread(new Worker("Task 4",4));
		Thread t5 = new Thread(new Worker("Task 5",5));
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
		t4.start();
		
		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t5.start();
		try {
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("\nBYE");
	}

}
