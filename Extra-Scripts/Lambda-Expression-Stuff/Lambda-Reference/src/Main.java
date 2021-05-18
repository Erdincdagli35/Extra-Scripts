
public class Main {

	public void doProcess(int i,Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10,i -> {
			System.out.println("Value of i is "+i);
			System.out.println(this);
			
		});
	}
	public static void main(String[] args) {

		Main main = new Main();
		main.execute();
		
		
	}

	public String toString() {
		return "ToString() Method";
	}
}

interface Process{
	void process(int i);
}