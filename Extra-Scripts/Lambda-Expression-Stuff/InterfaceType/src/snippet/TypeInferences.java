package snippet;

public class TypeInferences {

	public static void main(String[] args) {

		printLambda(str->str.length());
	}

	public static void printLambda(StringLambdaLen len) {
		System.out.println(len.getLen("Erdinç"));
	}
	
	interface StringLambdaLen{
		int getLen(String str);
	}
}
