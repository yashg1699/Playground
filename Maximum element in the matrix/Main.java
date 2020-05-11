#include<iostream>
using namespace std;
int main()
{
  int m,n,max=0;
  cin>>m>>n;
  int marks[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>marks[i][j];
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(marks[i][j]>=max)
        max=marks[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}