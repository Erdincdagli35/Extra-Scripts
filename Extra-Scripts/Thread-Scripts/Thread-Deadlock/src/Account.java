
public class Account {
	private int balance=10000;
	
	public void moneyWithdraw(int money) {
		balance-=money;
	}
	
	public void moneyDeposite(int money) {
		balance+=money;
	}
	public static void moneyTransfer(Account acc,Account acc2,int money) {
		acc.moneyWithdraw(money);
		acc.moneyDeposite(money);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
