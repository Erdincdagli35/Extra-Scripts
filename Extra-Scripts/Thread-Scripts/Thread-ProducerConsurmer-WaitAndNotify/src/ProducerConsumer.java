import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
	
	Random random = new Random();
	Object lock = new Object();
	Queue<Integer> que = new LinkedList<Integer>();
	private int limit=10;
	
	public void produce() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(lock) {
				if (que.size()==limit) {
					try {
						lock.wait();
						System.out.println("\n---\nWAIT for it\n---\n");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Integer val = random.nextInt(100);
				que.offer(val);
				System.out.println("PRODUCER is creating : "+val);
				lock.notify();
			}
		}
	}
	
	public void consume() {
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (lock) {
				if (que.size()==0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Integer val = que.poll();
				System.out.println("CONSUMER is getting "+val);
				System.out.println("Queue Size : "+que.size());
				lock.notify();
			}
			
		}
	}
}
