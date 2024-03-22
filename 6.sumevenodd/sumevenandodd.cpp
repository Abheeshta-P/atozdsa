#include<iostream>
using namespace std;

int main() {
	// Write your code here
	int n,temp,even=0,odd=0;
	cin>>n;
	while(n!=0){
		temp=n%10;
		if(temp%2==0)
		even+=temp;
		else
		odd+=temp;
		n=n/10;

	}
	cout << even<< " "<<odd;
}
