import java.util.concurrent.Semaphore;

public class SemaphoreTemp {

	private Semaphore sem = new Semaphore(3);
	
	public void threadFunc(int i) {
		// TODO Auto-generated method stub
		try {
			sem.acquire();
			System.out.println("Thread is beginnig ID:"+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is done ID:"+i);
		sem.release();
	}

}
