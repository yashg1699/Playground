#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int num,temp,div,sq,kap,digits=0;
  cin>>num;
  temp=num;
  while(temp>0)
  {
    temp=temp/10;
    digits++;
  }
  sq=num*num;
  div=pow(10,digits);
  kap=sq/div+sq%div;
  if(kap==num)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}