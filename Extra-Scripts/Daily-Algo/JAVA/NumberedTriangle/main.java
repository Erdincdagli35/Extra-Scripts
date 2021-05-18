import java.util.Scanner;
class main{
	/*
	 *Problem Statement
	 You need to print this pattern upto N. For N = 4, 1 1 2 1 2 3 1 2 3 4

	 Input
	 A single positive integer N.

	 Output
	 Numbered Triangle upto N. Do not leave trailing whitespaces at the end of each line.

	 Constraints
	 1 ≤ N ≤ 9

	 Sample Input
	 3

	 Sample Output

	 1
	 1 2
	 1 2 3
	 * */
	static int getN(){
		Scanner s = new Scanner(System.in);
		System.out.print("\nNumber : ");
		int N = s.nextInt();
		if(N>=1 && N<=9)
			return N;
		else
			return 0;
	}
	
	static void doIt(){
		int N = getN();
		//int arr[] = {};
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");	
			}
			System.out.println();
		}

	}

	public static void main(String args[]){
		System.out.print("Hello\n");
		doIt();	
		System.out.print("\nBye\n");
	}
}
