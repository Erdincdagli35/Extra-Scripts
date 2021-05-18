import java.util.Scanner;  // Import the Scanner
import java.lang.Math; 

class main{
	/*
	 *Problem Statement
	 Steve is playing a quiz game with his brother John. 
	 As Steve just learned the concept of leap year, John wanted to test his knowledge. 
	 For that, John started to ask Steve whether a year is a leap year or not by giving him a random year. 
	 Steve is little confused and he asks your help to the quiz.

	 Input
	 The first line of input contains one integer T. Next T lines will have years given by John.

	 Output
	 For each test case print "Yes" if it is a leap year else "No".

	 Constraints
	 1<=T<=100. 10^3<=Year<=10^5.

	 Sample Input
	 2
	 2000
	 2017

	 Sample Output

	 Yes
	 No
	*/
	static void getNum(){
		Scanner s = new Scanner(System.in);                                                                                                                                     System.out.print("Test Case : "); int T = s.nextInt(); 

		int i=0;		
		if(T>=1 && T<=100){
			while (i<T){			
				doIt();			
				i++;
			}	
	}	}
	
	static void doIt(){
		Scanner s = new Scanner(System.in);                                                                                                                                     System.out.print("Year : "); int year = s.nextInt();

		if(year>=Math.pow(10,3) && year<=Math.pow(10,5)){
			//System.out.print("if 1");
			if((year%400==0 || year%100!=0) && year%4==0)
				System.out.print("Yes\n");
			else
				System.out.print("No\n");
					
		}
	}

	public static void main(String args[]){
		System.out.println("Hello\n");
		getNum();
		
		System.out.println("\nBye");	
	}

}
