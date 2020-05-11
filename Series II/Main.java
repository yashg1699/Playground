#include<iostream>
using namespace std;
int main()
{
  int num,terms,i;
  cin>>terms;
  for(i=1,num=11;i<=terms;i++,num+=4)
  {
    cout<<num*num<<" ";
  }
}