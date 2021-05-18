
public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		AccountWorker aw = new AccountWorker(a);
		
		Thread t1 = new Thread(aw);
		Thread t2 = new Thread(aw);
		Thread t3 = new Thread(aw);
		
		t1.setName("Erdinç");
		t2.setName("Emre");
		t3.setName("Elif");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
