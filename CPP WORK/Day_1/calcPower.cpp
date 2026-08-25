#include<iostream>
using namespace std;

	int power(int b,int e){

        int total = 1;
		for(int i = 1; i <= e; i++){
			total = total * b;

		}
    return total;

	}


int main(){

	int base,expo;

	cout << "Enter Base and exponent ";
	cin >> base >> expo;

	cout <<"Power  = " << power(base,expo);

}
