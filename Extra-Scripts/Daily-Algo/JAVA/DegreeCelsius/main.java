import java.util.Scanner;
class main{
	/*
	 *Problem Statement
	 *Tom is a scientist.
	 *He uses huge machines for complex calculations. There is a problem, 
	 *the machines takes input as Fahrenheit and Tom has the temperatures in Degree Celsius. 
	 *As he is busy with his work, he asks your help to convert Degree Celsius to Fahrenheit.

	 Input
	 The first and only line of the input consists of a single integer T denoting temperature in Degree Celsius.

	 Output
	 Print an integer denoting temperature in Fahrenheit.

	 Constraints
	 0<=T<=1000

	 Sample Input
	 100

	 Sample Output

	 212
	 * */
	static void getNum(){
		Scanner s = new Scanner(System.in);                                                                                                                                     System.out.print("Celcius : "); double T = s.nextDouble(); 
						
		if(T>=0 && T<=1000)
			System.out.print("Fahrenheit : "+doIt(T));	
		else
			System.out.print("\nOut");		

	}
	static double doIt(double T){
		return  (T*(1.8000))+32.0;
//		return T;
	}

	public static void main(String args[]){
		System.out.print("Hello\n");
		getNum();
		System.out.print("\nBye\n");
	}
}
