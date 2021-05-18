import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantCondition {

	private int count =0;
	private Lock lock = new ReentrantLock();
	private Condition cond  = lock.newCondition();
	
	public void ascending() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}
	public void thread1Func() {
		// TODO Auto-generated method stub
		lock.lock();
		try {
			System.out.println("Thread 1 is initilizing");
			System.out.println("Thread 1 is waiting for wake up ");
			try {
				cond.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 is woke up.It's doing ...");
			ascending();
		} finally {
			lock.unlock();
		}
		
		
	}
	public void thread2Func() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		
		lock.lock();
		System.out.println("Thread 2 is initilizing");
		try {
			ascending();
			System.out.print("Press the key for continue :");scanner.nextLine();
			cond.signal();
			System.out.println("Thread 2 said :'Thread 1 is woke up.I gotta go there'");
		} finally {
			lock.unlock();
		}
	}
	public void threadOver() {
		// TODO Auto-generated method stub
		System.out.println("COUNT : "+count);
	}

}
