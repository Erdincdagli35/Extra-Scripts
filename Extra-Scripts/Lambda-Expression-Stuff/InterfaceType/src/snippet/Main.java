package snippet;

public class Main {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Main greeter = new Main();
		
		Greeting lambdaGreeting =() -> System.out.println("Hello Interface");
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {System.out.println("Hello Main");}
		};
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
		
		
	}

}
