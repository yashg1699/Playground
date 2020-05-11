#include<iostream>
using namespace std;
int main()
{
  int first,second,third,min,i,div;
  cin>>first>>second>>third;
  if(first>=second && first>=third)
  {
    if(second>=third)
    {
      cout<<"The treasure is in box which has number "<<second;
      min=third;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<third;
      min=second;
    }
  } 
  else if(second>=first && second>=third)
  {
    if(first>=third)
    {
      cout<<"The treasure is in box which has number "<<first;
      min=third;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<third;
      min=first;
    }
  }
  else
  {
    if(first>=second)
    {
      cout<<"The treasure is in box which has number "<<first;
      min=second;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<second;
      min=first;
    }
  }
for(i=1;i<=min;i++)
{
  if(first%i==0 && second%i==0 && third%i==0)
    div=i;
}
  cout<<"\nThe code to open the box is "<<div;
}