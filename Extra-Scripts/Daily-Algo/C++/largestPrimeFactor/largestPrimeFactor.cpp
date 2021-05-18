#include <iostream>

static int primeFactor(long int num){
	
	int i=0,maxOne=2;
	for(i=2;i<=num;i++){
		if(num%i==0){
			//std::cout<<i<<std::endl;		
			num/=i;	
			if(i>maxOne)
				maxOne=i;
		}
		
	}
	return maxOne;
		
}
//	std::cout<<"A : "<<maxOne;

int main() {
    std::cout << "Hello\n"<<std::endl;
    std::cout<<"Result : "<<primeFactor(600851475143)<<std::endl;
    std::cout<<"\nBye"<<std::endl;
    return 0;
}
