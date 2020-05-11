#include<iostream>
using namespace std;
int main()
{
  int month,num1,num2,fib;
  cin>>month;
  for(int i=1;i<=month;i++)
  {
    if(i==1 || i==2)
    {
      num1=0;
      num2=1;
    }
    else
    {
      fib=num1+num2;
      num1=num2;
      num2=fib;
    }
  }
  cout<<fib;
}