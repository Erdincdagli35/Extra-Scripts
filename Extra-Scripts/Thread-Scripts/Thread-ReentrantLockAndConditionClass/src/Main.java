
public class Main {

	public static void main(String args[]) {
System.out.println("HELLO\n");
		
		final ReentrantCondition p = new ReentrantCondition();
		
		Thread producer = new Thread(new Runnable()
				{
				 @Override
				 public void run() {
					 p.thread1Func();
				 }
				});
		Thread consumer = new Thread(new Runnable()
		{
		 @Override
		 public void run() {
			 p.thread2Func();
		 }
		});

		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.threadOver();
		
		System.out.println("\nBYE");
	}
}
