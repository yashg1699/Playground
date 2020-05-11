#include<iostream>
using namespace std;
int gcd(int num1,int num2,int small)
{
  if(small==1)
    return 1;
  else if(num1%small==0 && num2%small==0)
    return small;
  else
    gcd(num1,num2,small-1);
}
int main()
{
  int num1,num2;
  cin>>num1>>num2;
  if(num1>=num2)
   cout<<"G.C.D of "<<num1<<" and "<<num2<<" = "<<gcd(num1,num2,num2);
  else
     cout<<"G.C.D of "<<num1<<" and "<<num2<<" = "<<gcd(num2,num1,num1);
}