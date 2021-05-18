
public class Main {

	public static void main(String[] args) {

		/*ILambda isntDouble = (num) -> { 
			if (num%2==0) 
				return true;
			
			else 
				return false;
			
		};*/
		
		//ILambda greeting = (text) -> {System.out.println(text);};
		/*ILambda divide = (s1,s2) -> {
			if(s2==0) return 0;
			else return s1/s2;
		};*/
		
		ILambda stringLength = (text) -> text.length();
		
		//greeting.sayIt("Merhaba");
		//System.out.println(isntDouble.isntDouble(35));
		//System.out.println(divide.divideIt(4, 2));
		System.out.println(stringLength.countIt("Fenerbahçe"));
	}
}
