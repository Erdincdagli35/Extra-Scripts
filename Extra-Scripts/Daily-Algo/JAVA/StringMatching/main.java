import java.util.Scanner;  // Import the Scanner
public class main{
	/* Cody has a sequence of characters N.
	 *He likes a sequence as a substring.
	 * Given the sequence and his favourite sequence F, check whether the favourite sequence is present in the sequence.
	 *
	 * INPUT
	 * The first line of input contains a single line T, which represents the number of test cases
	 * Each test case consists of strings seprated by space N and F respectively
	 * 
	 * SAMPLE INPUT
	 * 2
	 * abcde abc
	 * pqrst pr
	 *
	 * OUTPUT
	 * Print "Yes" if the sequence contains the favourite sequence in it, otherwise print "No"
	 *
	 * SAMPLE OUTPUT 
	 * Yes
	 * No
	 *
	 * CONSTRAINTS
	 * 1 <= T <= 10
	 * 1 <= |N|, |F|<=100.
	 *
	 * All the characters are lowercase aphabets
	 */
	static void getNum(){
		Scanner s = new Scanner(System.in);                                                                                                                                     System.out.print("Test Case : "); int T = s.nextInt(); 
		int i=0;
		while (i<T){
			doIt();
			i++;
		}
	}
	static 	void doIt(){
		
		Scanner s = new Scanner(System.in);
		//System.out.print(""); T = s.nextInt();
		System.out.print("\nWord : ");String word =s.nextLine();
		System.out.print("Test Word : ");String testWord=s.nextLine();
		//String[] testWordArr	= testWord.split("");
		String[] testWordArr = word.split(testWord);
		if(word == testWordArr[0] || testWordArr[(testWordArr.length-1)]==null)
			System.out.println("No\n");	                
		else
			System.out.println("Yes\n");

	}
	     
	public static void main(String args[]){

		System.out.println("Hello\n");
		getNum();
		System.out.println("\nBye");
		
		
		/*First Test Part
		String word="pqrst";
		String[] testWord=word.split("pr");

		if(word == testWord[0] || testWord[(testWord.length-1)]==null)
			System.out.println("No");
		else
			System.out.println("Yes");
*/		
		

	}
}
