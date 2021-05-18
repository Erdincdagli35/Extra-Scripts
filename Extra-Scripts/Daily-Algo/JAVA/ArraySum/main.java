import java.util.Scanner;
import java.util.Random;

class main{
	/*
	 Problem Statement
	 You are given an integer array and you have to find the sum of the elements of 	  the array and find the remainder when the sum is divided by the largest number 	   of the array.

	 Input
	 First line contains N, the number of elements. Next line contains N space     		  separated integers (elements of the array).

	 Output
	 Print the remainder when sum is divided by the maximum element.

	 Constraints
	 1 ≤ n ≤ 100 0 ≤ A[i] ≤ 1000

	 Sample Input
	 5
	 1 2 3 4 5

	 Sample Output

	 0

	 * */
	//I'm gonna set a random element for array
	static int getNum(){

		Scanner s = new Scanner(System.in); 		
		System.out.print("N : "); int N = s.nextInt();		
		
		if(N>=1 && N<=100)
			return N;//doIt(N);		
		else					
			return 0;		
		}	
	
	static int[] getArray(){
		
		Random rd = new Random();//rd=rd.nexInt(1000);
      		int[] arr = new int[getNum()];
		int sum=0;

      		for (int i = 0; i < arr.length; i++) {
	            arr[i] = rd.nextInt(5); // storing random integers in an array
		//    sum=sum + arr[i];	
	            System.out.print(arr[i]+" "); // printing each array element
	         }
    		//System.out.print("adasd :"+sum);		
		return arr;
	}	
	static int sendResult(){
		int[] arr = getArray();
		int sum=0; 
		for (int i = 0; i < arr.length; i++)   
			sum=sum + arr[i];
		int max=0;                                                                               for (int i = 0; i < arr.length; i++)                                                             if(arr[i]>0)                                                                                       max=arr[i]; 

		return sum%max;
		
	
	}
	public static void main(String args[]){
		System.out.print("Hello\n");
		System.out.print("\n"+sendResult());
		System.out.print("\nBye\n");
	}
}
