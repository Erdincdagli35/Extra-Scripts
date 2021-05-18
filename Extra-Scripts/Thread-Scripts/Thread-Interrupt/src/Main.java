import java.util.List;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		
		final List<Integer> list  = new LinkedList<Integer>();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread is initilized");
				
				for (int i = 0; i < 1000000; i++) {
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("INTERRUPT");
						return;
					}
					list.add(i);
				}
				/*
				for (int i = 1; i < 11; i++) {
					System.out.println("Thread is Typing..."+i);
					
					try {
						Thread.sleep(1000);
						System.out.println("Sleeping "+1+".second... zZ");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Sleeping is done :( ");
					}
				}*/
				System.out.println("Thread is builded as success");
			}
		});
		
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread.interrupt();
		
		System.out.println("\nBYE");
	}

}
