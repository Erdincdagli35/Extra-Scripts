import java.util.Scanner;

class main{
	/*
	 *Problem Statement
	 This problem requires you to create a output string from input string such that for every character in input string, 
	 there are three same characters in output string.

	 Input
	 First line contains N, the number of letters in the string. The next line contains the string.

	 Output
	 Print the output_string.

	 Constraints
	 1 ≤ N ≤ 20

	 Sample Input
	 5
	 Hello

	 Sample Output

	 HHHeeellllllooo
	 * */
	/*static int getLenOfArray(int N){
		if(N>=1 && N<=20)
			return N;
		
		else
			return 0;
	}*/
	static String getWord(String word){
		if(word!=null)
			return word;
		else 
			return null;
	}
	static void getInputs(){
		Scanner s = new Scanner(System.in);
		/*
		System.out.print("Length : ");
		int len = s.nextInt();
		System.out.print(getLenOfArray(len));	
		*/
		System.out.print("Array : ");
		String arr = s.nextLine();
		//System.out.print(getWord(arr));
		doIt(getWord(arr));
	}
	static void doIt(String word){
		String[] tempArr = word.split("");

		for(int i=0;i<(tempArr.length);i++){
			for(int j=0;j<3;j++){
				System.out.print(tempArr[i]);
		
			}
		}
	}
	public static void main(String args[]){
		System.out.print("Hello\n");
		getInputs();
		System.out.print("\nBye\n");
	}
}
