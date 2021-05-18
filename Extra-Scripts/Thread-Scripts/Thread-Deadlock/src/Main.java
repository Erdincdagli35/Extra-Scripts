
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		 
		final Deadlock deadlock = new Deadlock();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				deadlock.thread1Func();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				deadlock.thread2Func();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		deadlock.threadOver();
		
		System.out.println("\nBYE");
	}

}
