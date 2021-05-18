import java.util.Scanner;
class main{
	/*Problem Statement
	 * There are N students in a class and Teacher want to divide these students into some groups . 
	 * Teacher told  that groups consisting of two or less students not allowed , 
	 * so Teacher want to have as many groups consisting of three or more students as possible.
	 * Divide the students so that the number of groups consisting of three or more students is maximized.
	 *
	 * Input
	 * Single integer N
	 *
	 * Output
	 * Maximum number of groups can be formed
	 *
	 * Constraints
	 * 1<=N<100000
	 *
	 * Sample Input
	 * 6
	 *
	 * Sample Output
	 *
	 * 2
	 *
	 * */
	static void getNum(){
		Scanner s = new Scanner(System.in);                                                                                                                                     System.out.print("Number : "); int T = s.nextInt(); 
		
		if(T>=1 && T<=100000)
			System.out.print(doIt(T));	
		else
			System.out.print("\nOut");		
	}
	static int doIt(int T){
		int arr[]= new int[15];
		int temp=0;
		for(int i=10;i>=3;i--){
			if(T%i==0 && i!=T)
				temp=(T/i);
			
		}
		return temp;

	}

	public static void main(String args[]){
		System.out.print("Hello\n");
		getNum();
		System.out.print("\nBye\n");
	}
}
