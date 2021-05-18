
public class MethodReferencesExample2 {

	public static void printMethod() {
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {

		Thread t = new Thread(MethodReferencesExample2::printMethod);
		t.start();
		
	}

}
