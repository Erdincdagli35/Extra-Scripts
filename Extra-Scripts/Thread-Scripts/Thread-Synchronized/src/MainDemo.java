import java.util.logging.Level;
import java.util.logging.Logger;

public class MainDemo {
	private int count=0;
	
	public synchronized void ascending() {
		count++;
	}
	public void theardsRun() {
		Thread thread1= new Thread(new Runnable() 
		{
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					ascending();
				}
			}
		});
		
		Thread thread2= new Thread(new Runnable() 
		{
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					ascending();
				}
			}
		});
		thread1.start();
		thread2.start();
		
		//using "join" for wait part
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(MainDemo.class.getName()).log(Level.SEVERE,null,e);
		}
			
		
		
		
		System.out.println("Count : "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		MainDemo mainDemo = new MainDemo();
		mainDemo.theardsRun();
		
		System.out.println("\nBYE");
	}

}
