
public class ThreadLambda {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("It works");
			}
		});

		thread.run();
		
		Thread lambdaThread = new Thread(()->System.out.println("Lambda works"));
		lambdaThread.run();
		
	}

}
