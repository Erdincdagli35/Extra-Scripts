#include <iostream>
/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 * */
static void primeNumber(int range){
	long int sum=0;
	for (long int i=2; i<range; i++){		          
	     bool prime=true;
	     for (long int j=2; j*j<=i; j++){
		     if (i % j == 0) {										                    
			    prime=false;
			    break;    	
		     }
				
	     }   
	     if(prime) 
		     if(i<range)
			     sum+=i;
		     	   
		
	}
	std::cout << sum << "\n";
}
int main() {
	    std::cout << "Hello World!";
	    primeNumber(10);
	    primeNumber(2000000);
	    return 0;
}
