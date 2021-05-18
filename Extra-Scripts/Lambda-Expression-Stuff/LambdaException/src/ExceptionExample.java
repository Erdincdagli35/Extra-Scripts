import java.util.function.BiConsumer;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5};
		int key = 0;
		
		process(numbers,key,wrapperLambda((n,k)-> System.out.println(n/k)));
			
		
	}

	private static void process(int[] numbers, int key,BiConsumer<Integer,Integer> consumer) {
			for (int i : numbers ) {
				//System.out.println(i+key);
				consumer.accept(i, key);
			}
		
	}
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
		return(n,k)->{
			try {
				consumer.accept(n, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught a wrapper lambda");
			}
		};
	}

}
