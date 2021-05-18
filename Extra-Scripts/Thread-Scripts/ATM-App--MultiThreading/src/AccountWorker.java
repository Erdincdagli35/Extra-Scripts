public class AccountWorker implements Runnable{
	
	private Account acc;

	public AccountWorker(Account acc) {
		super();
		this.acc = acc;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			makeWithDraw(1000);
			if(acc.getBalance()<0)
				System.out.println("Account is overdrawn!");
			
		}
	}

	private synchronized void makeWithDraw(int temp) {
		// TODO Auto-generated method stub
		if (acc.getBalance()>= temp) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw TL : "+temp+" Balance : "+acc.getBalance());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				
			}
			acc.withDraw(temp);
			System.out.println(Thread.currentThread().getName()+" completes the withdrawal of TL : "+temp);
		}
		else {
			System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw "+acc.getBalance());
		}
	}
	
}
