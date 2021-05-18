import java.util.ArrayList;
import java.util.Random;

public class ListWorker {

	Random random = new Random();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	private Object lock1= new Object();
	private Object lock2= new Object();
	
	
	public void addValueToArrayList() {
		synchronized(lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}
	public void addValueToArrayList2() {
		synchronized(lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}
	
	public void assignValue() {
		for (int i = 0; i < 1000; i++) {
			addValueToArrayList();
			addValueToArrayList2();	
		}
		
		
		
	}
	public void run() {
		Thread thread1 = new Thread(new Runnable()
				{
					@Override
					public void run() {
						assignValue();
					}
				});
		Thread thread2 = new Thread(new Runnable()
		{
			@Override
			public void run() {
				assignValue();
			}
		});
		long startPoint = System.currentTimeMillis();
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Size of List 1 : "+list1.size());
		System.out.println("Size of List 2 : "+list2.size());
		long finishPoint = System.currentTimeMillis();
		
		System.out.println("Total Run Time :"+(finishPoint-startPoint));
	}
}
