import java.util.Scanner;
class main{
	/*
	 *Problem Statement
	 Archie was given a homework by his teacher. He is given a fraction and he needs to write it in its reduced form. Archie is not good at Maths. Help Archie finish his homework.

	 Input
	 2 integers separated by space denoting the numerator and denominator respectively.

	 Output
	 Print the reduced form of the fraction

	 Constraints
	 1 ≤ N ≤ D ≤ 1000

	 Sample Input
	 20 40

	 Sample Output

	 1 2
	 * */
	static void doIt(){
		Scanner s = new Scanner(System.in);
		System.out.print("Up Number : ");
		int N  = s.nextInt();
		System.out.print("Down Number : ");                                                                                                                                                 int D  = s.nextInt();
		
		if(1<=N && N<=D && D<=1000){
			for(int i=2;i<D;i++){
				if(D%i==0 && N%i==0){
					D=D/i;
					N=N/i;
				}
				else if(D==N)
					N=D=1;

			}
			System.out.print(N+" "+D);
		}
		      
	        else 
		     System.out.print("ERROR : Range of out ");	
	}

	public static void main(String args[]){
		
		System.out.print("Hello\n");
		doIt();
		System.out.print("\nBye\n"); 
	}
}
