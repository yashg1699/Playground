#include<iostream>
using namespace std;
int main()
{
  int num,sum=0;
  cin>>num;
  int num2=num;
  while(num>0)
  {
    sum+=num%10;
    num=num/10;
  }
  if(num2%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}