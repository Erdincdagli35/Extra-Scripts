
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		final ProducerConsumer p = new ProducerConsumer();
		
		Thread producer = new Thread(new Runnable()
				{
				 @Override
				 public void run() {
					 p.produce();
				 }
				});
		Thread consumer = new Thread(new Runnable()
		{
		 @Override
		 public void run() {
			 p.consume();
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
		
		System.out.println("\nBYE");
	}

}
