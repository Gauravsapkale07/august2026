#include<iostream>
using namespace std;
int main()
{
    int p = 10000,t = 2,amount,temp = p;
    float r = 5;

    for(int i = 1;i <= t; i++){
    amount = p * (1 + r/100);
    p = amount;
    }
    cout << "Amount = " << amount;

    cout << "\nCI = " << amount - temp;
}