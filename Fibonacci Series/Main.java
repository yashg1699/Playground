#include<iostream>
using namespace std;
int fib(int term)
{
  if(term==1)
    return 0;
  else if(term==2)
    return 1;
  else
    return fib(term-1)+fib(term-2);
}
int main()
{
  int term;
  cin>>term;
  cout<<"The term "<<term<<" in the fibonacci series is "<<fib(term);
}