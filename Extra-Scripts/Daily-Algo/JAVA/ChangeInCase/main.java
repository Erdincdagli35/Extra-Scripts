import java.util.Scanner;
class main{
	/*
	 *Problem Statement
	 You will be given a single string and two positive integers denoting indices. 
	 You need to change the case of the characters at those indices,i.e change 		  uppercase to lowercase and lowercase to uppercase. It is guaranteed that all 		   characters in the string are alphabets.

	 Input
	 The first line contains N, the length of string. 	
	 The next line contains a single string. Two integers, x and y, in next line 		  separated by space.

	 Output
	 Print the string after altering the case of characters at those indices

	 Constraints
	 1 ≤ string.length ≤ 40 0 ≤ x,y ≤ string.length

	 Sample Input
	 6
	 Dcoder
	 0 3

	 Sample Output

	 dcoDer
	 *
	 * */

	static void doIt(){
		char[] alphabet = "abcçdefgğhıijklmnoöpqrsştuüvwxyz".toCharArray();                            char[] alphabetU = "ABCÇDEFGĞHIİJKLMNOÖPQRSTUÜVWXYZ".toCharArray();                           
		Scanner s = new Scanner(System.in);
		System.out.print("Length : "); int len= s.nextInt(); 		
		Scanner f = new Scanner(System.in);
		System.out.print("Array : "); String str= f.nextLine();                                  char[] arr = str.toCharArray();                                                                                                                                                   System.out.print("X : "); int X= s.nextInt();                                            System.out.print("Y : "); int Y= s.nextInt();                                            int[] nums ={X,Y};
		//while(len>=1 && len<=40 && X>=0 && X<=arr.length && Y>=0 && Y<=arr.length && arr.length==len){

					
		
				for(int j=0;j<nums.length;j++){                                                                  for(int i=0;i<alphabet.length;i++){                                                              for(int k=0;k<alphabetU.length;k++){                                                             if(arr[nums[j]]==alphabet[i] && i==k)                                                            arr[nums[j]]=alphabetU[k];                                                       else if(arr[nums[j]]==alphabetU[k] && i==k)                                                             arr[nums[j]]=alphabet[i];                                                                                                                                  }                                                                                                                                                                         }                                                                                }
	
		//}
		//return arr;	
		for(int i=0;i<arr.length;i++)                                                                    System.out.print(arr[i]); 

	}
	public static void main(String args[]){
		System.out.print("Hello\n");
		/*char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] alphabetU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] arr= "Erdinç".toCharArray();
		int[] nums ={3,0};
		for(int j=0;j<nums.length;j++){	
			for(int i=0;i<alphabet.length;i++){	
				for(int k=0;k<alphabetU.length;k++){
					if(arr[nums[j]]==alphabet[i] && i==k)
						arr[nums[j]]=alphabetU[k];
					else if(arr[nums[j]]==alphabetU[k] && i==k)                                                             arr[nums[j]]=alphabet[i];
		
				}
		
			}
		}

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		*/
		doIt();

		System.out.print("\nBye\n");
	}
}
