import java.util.Scanner;

class main{
	/*All memeber in NumverLand are standing in a circle for a dancing ceremony.
	 *Every number needs dancing partner.
	 *Dancing partner of any number is the number which is standing radially oposite to it in the circle.
	 *The numbers are from 0 to N-1.
	 *A certain number X wants to know who will be its dancing partner
	 *Please help X
	 *
	 * INPUT
	 * Two positive integers denoting the value of N and X.
	 *
	 * SAMPLE INPUT
	 * 8 2
	 *
	 * OUTPUT
	 * Print the number radially opposite to X in a circle of N numbers.
	 *
	 * SAMPLE OUTPUT
	 * 6
	 *
	 * CONSTRAINTS
	 * 4<=N<=20
	 * 0<=X<N	
	*/
//	01234
//	43210
	static void fillArray(int N,int X){
		int arr[]=new int[N];                
		if(N>=4 && N<=20){
			if(X>=0 && X<=N){
									                                
			//	System.out.println("\nBye1");				
				for(int i=0;i<=N-1;i++){													                                        
					arr[i]=i;
							
				}
				
			}

		}
		 for(int i=0;i<=(N-1);i++){                                                                                                                                                      if(arr[i]==X)                                                                                                                                                              System.out.println("Output : "+arr[arr.length-i]);                                                                                                                                                                                                                                                                                               } 
	}

	static void getXandN(){
		Scanner s = new Scanner(System.in);
		System.out.print("\n\nN : ");int N = s.nextInt();
		System.out.print("X : ");int X = s.nextInt(); 
		
		fillArray(N,X);
		
	}

	public static void main(String main[]){
		System.out.println("Hello");
		getXandN();
		/*
		int X=3,N=4;
		int arr[]=new int[N];
		if(N>=4 && N<=20){
			if(X>=0 && X<=N){
				System.out.println("\nBye1");
				for(int i=0;i<=N-1;i++){
					arr[i]=i;                               
				}
				
			}
		
		}
		for(int i=0;i<=(N-1);i++){			
			if(arr[i]==X)                                                                                                                                                              System.out.println(arr[arr.length-i]);

		}*/
		//arr[0]=2;
		//System.out.print(arr[5]);
		System.out.println("\nBye"); 
	}
}
