#include <iostream>
using namespace std;
/*
 *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 * */
static int findABC(int c){
	int a=0,b=1;
	if(a<b && b<c){
		int cSquare=c*c;
		cSquare=(a*a)+(b*b);
	}
}

int main() {
	    cout << "Hello World!"<<endl;
	    return 0;
}
