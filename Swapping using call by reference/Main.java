#include<iostream>
int main()
{
  int a,b;
  int temp;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  temp=a;
  a=b;
  b=temp;
  
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}  