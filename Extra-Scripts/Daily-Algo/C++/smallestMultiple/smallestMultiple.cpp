#include <iostream>
#include <vector>
#include <cmath>

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 2,3,5,7 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * */

static std::vector<int> printPrimeNumbers(int num){
	std::vector<int> temp;
	temp.push_back(2);
	for (int i=2; i<=num; i++) 		        
		for (int j=2; j<i; j++)		        
		{			            
			if (i % j == 0) 
				break;
		
		
			else if (i == j+1){	
				temp.push_back(i);
			}
		}   
	return temp;

}

static int smallestMultiple(int primeNumberRange){
	std::vector<int> primeNumber=printPrimeNumbers(primeNumberRange);
	int i,newNum=1,newNum2=1,temp=0;
	for(int i=0;i<primeNumber.size();i++){
		int mathPart = floor(log(primeNumberRange)/log(primeNumber.at(i)));
		newNum*=(pow(primeNumber.at(i),mathPart));
	}

	return newNum;
} 
static void print(int num){
	std::cout << 
		"Result : "
		<<smallestMultiple(num)
	<<std::endl;
}
int main() {
	    std::cout << "Hello"<<std::endl;
	    print(10);
	    print(20);

	    return 0;
}
