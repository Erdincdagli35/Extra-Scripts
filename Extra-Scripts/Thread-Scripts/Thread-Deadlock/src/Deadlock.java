import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

	private Account a1 = new Account();
	private Account a2 = new Account();
	private Random random = new Random();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	public void checkOutLocks(Lock a,Lock b) {
		boolean aTemp=false,bTemp=false;
		while (true) {
			aTemp=a.tryLock();
			bTemp=b.tryLock();
			if (bTemp==true && aTemp==true) {
				return;
			}
			if (aTemp==true) {
				a.unlock();
			}
			if (bTemp==true) {
				b.unlock();
			}
		}
	}
	public void thread1Func() {
		// TODO Auto-generated method stub
		
		checkOutLocks(lock1,lock2);
		for (int i = 0; i < 5000; i++) {
			Account.moneyTransfer(a1, a2, random.nextInt(100));
		}
		
		lock1.unlock();
		lock2.unlock();
		
	}

	public void thread2Func() {
		// TODO Auto-generated method stub
		checkOutLocks(lock2,lock1);
		
		for (int i = 0; i < 5000; i++) {
			Account.moneyTransfer(a1, a2, random.nextInt(100));
		}
		
		lock1.unlock();
		lock2.unlock();
	}
	public void threadOver() {
		// TODO Auto-generated method stub
		System.out.println("Account 1 : "+a1.getBalance()+
					    "\n"+"Account 2 : "+a2.getBalance()+
					    "\nTotal Balance : "+(a1.getBalance()+a2.getBalance()));
	}

}
