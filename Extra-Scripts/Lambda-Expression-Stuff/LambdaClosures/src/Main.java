
public class Main {

	public static void main(String[] args) {
		
		int x=10,y=20;
		doProcess(x,i -> System.out.println(i+y));

	}

	private static void doProcess(int i, Process process) {
		process.process(i);
		
	}

}
