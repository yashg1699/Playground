#include<iostream>
using namespace std;
int main()
{
  int m,n,sum=0;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==0 || i+j==n-1 || i==m-1)
        sum+=a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}