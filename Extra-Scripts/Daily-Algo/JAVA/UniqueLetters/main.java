import java.util.Scanner;
import java.util.Arrays;
class main{
	/*
	 * Aycan
	 * ycn
	 *
	 * emre
	 * emre 
	 * mr
	 * */
	
	static String getInputs(){
		Scanner s = new Scanner(System.in);
		System.out.print("Word : ");String word = s.nextLine();
		//doIt(word);
		return word;

	}
	static void doIt(){
		String word=getInputs();
		char[] arr=word.toCharArray();
		char[] arrTemp=new char[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j] && i!=j ){
					arr[i]=arr[j]=0;
				}	
			}
			System.out.print(arr[i]);
		}
		System.out.print("\n");
	}
	public static void main(String args[]){
		System.out.print("Hello\n");
		doIt();

	}
	


		
}
