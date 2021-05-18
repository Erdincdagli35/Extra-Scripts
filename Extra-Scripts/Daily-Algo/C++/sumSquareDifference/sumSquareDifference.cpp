#include <iostream>
using namespace std;
/*
 *The sum of the squares of the first ten natural numbers is,

 The square of the sum of the first ten natural numbers is,

 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * */
static int isTheSumOfTheSquares(int num){
	int sum=0,squareI=1;
	for(int i=1;i<=num;i++){
		squareI=i*i;
		sum+=squareI;
	}
	return sum;
}
static int isTheSquareofSum(int num){
	int sum=0,squareI;
	for(int i=1;i<=num;i++){                                                                                                                              
		sum+=i;
	}
	squareI=sum*sum;	
	return squareI;        
}
static int difference(int num){
	
	int diff = isTheSquareofSum(num)-isTheSumOfTheSquares(num);
	return diff;
}
int main() {
	    cout << "Hello World!"<<endl;
	    /*isTheSumOfTheSquares(10);
	    isTheSquareofSum(10);
*/
	    cout << difference(100)<<endl;
	    return 0;
}


