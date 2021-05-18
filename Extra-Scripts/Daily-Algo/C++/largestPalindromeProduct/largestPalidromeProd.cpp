#include <iostream>
/*
 *A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 * */

static bool isPalindrome(int num){
	int reverse=0;
	int numTemp=num;
	while(num>0){
		reverse=10*reverse +num%10;
		num/=10;
	}

	return numTemp==reverse;	
}
static int findBigOne(){
	int temp=0;
	for(int i=990;i>99;i-=11){
		for(int j=999;j>99;j--){
			int multip=i*j;
			if(temp<multip && isPalindrome(multip)){
				temp=multip;
				break;
			}
			else if(temp<multip)
				break;
		}
	}
	return temp;
}
int main() {
	    std::cout << "Hello World!";
	    //std::cout <<"Result : "<<isPalindrome(221);		   
	    std::cout<<"\nResult : "<<findBigOne(); 
	    return 0;
}
