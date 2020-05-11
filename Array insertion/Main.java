#include<iostream>
using namespace std;
int main()
{
  int n,loc,value;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int num[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>num[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc-1>n-1)
  {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  cin>>value;
  for(int i=n-1;i>=loc-1;i--)
    num[i+1]=num[i];
  num[loc-1]=value;
  n++;
  cout<<"Array after insertion is\n";
  for(int i=0;i<n;i++)
    cout<<num[i]<<"\n";
}