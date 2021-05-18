#include <iostream>
using namespace std;
/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */

static int listAll3and5K(int belowNumber){
	int num=0,sum=0;
	while(num<belowNumber){
		if(num%3==0 || num%5==0)
			sum+=num;
		num++;
	}
	return sum;
}
static void print(int num){
	cout << "Result : "<< listAll3and5K(num);
}

int main() {
	    cout << "Hello"<<endl;
	    print(1000);
	    cout << "\n\nBye"<<endl;
	    return 0;
}
