public class Worker implements Runnable{

	private String name;
	private int taskId;
	
	public Worker(String name, int taskId) {
		super();
		this.name = name;
		this.taskId = taskId;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Wroker Class : "+name+" "+taskId+" is started");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Wroker Class : "+name+" "+taskId+" is finished");
	}

	
	
}
