import java.util.Scanner;

public class WaitNotify {

	private Object lock = new Object();
	public void thread1Function() {
		synchronized(lock){
			System.out.println("Thread 1 is initiliazed");
			System.out.println("Thread 2 is waiting Thread2 for same process like it");
			
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 is woke up.It's doing...");
		}
	}
	public void thread2Function() {
		Scanner scanner = new Scanner(System.in);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(lock){
			System.out.println("Thread 2 is initiliazed");
			System.out.print("Press the key for continue :");scanner.nextLine();
			lock.notify();
			
			System.out.println("Thread 1 said 'Okey Bro I'm gonna..'");
		}
	}
}
