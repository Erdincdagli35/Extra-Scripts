import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		ExecutorService exe = Executors.newFixedThreadPool(1);
		/*
		exe.submit(new Runnable() {
			@Override
			public void run() {
				Random run = new Random();
				System.out.println("It's RUN");
				int time = run.nextInt(1000)+2000;
				
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Exit");
			}
		});*/
		
		Future <Integer> future =exe.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception{
				Random run = new Random();
				System.out.println("It's RUN");
				int time = run.nextInt(1000)+2000;
				
				if(time>2500) {
					throw new IOException("Thread is time out");
				}
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Exit");
				return time;
			}
		});
		
		exe.shutdown();
		
		try {
			System.out.println("Result : "+future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("\nBYE");
	}

}
