#include<iostream>
using namespace std;

int main() {
	// Write your code here
	char symbol;
	cin>>symbol;
	if(65<=symbol&&symbol<=90)
	cout<< 1;
	else if(97<=symbol&&symbol<=122)
	cout<< 0;
	else
	cout<<-1;
}
