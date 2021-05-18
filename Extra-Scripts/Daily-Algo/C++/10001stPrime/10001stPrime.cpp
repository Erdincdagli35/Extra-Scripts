#include <iostream>
using namespace std;
/*
 *By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 * */
static /*int*/void primeNumber(int range){
	int count=0;
	for(int i=2;i<200000;i++){
		bool prime=true;
		for(int j=2;j*j<=i;j++){
			if(i%j==0){
				prime=false;
				break;
			}

		}
		if(prime){ 
			count++;
			if(count==range)
				cout<< i<<endl;
		}
	}
}
int main() {
	    cout << "Hello World!";
	    primeNumber(6);
	    primeNumber(10001);    
	    return 0;
}
