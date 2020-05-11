#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,sum_diag1=0,sum_diag2=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==j)
        sum_diag1+=a[i][j];
      if(i+j==n-1)
        sum_diag2+=a[i][j];
    }
  }
  if(sum_diag1!=sum_diag2)
  {
    cout<<"No";
    return 0;
  }
 for(int i=0;i<n;i++)
  {
    int rowsum=0;
    for(int j=0;j<n;j++)
      rowsum+=a[i][j];
   if(rowsum!=sum_diag1)
   {
     cout<<"No";
     return 0;
   }
  }
  
  for(int i=0;i<n;i++)
  {
    int colsum=0;
    for(int j=0;j<n;j++)
      colsum+=a[j][i];
   if(colsum!=sum_diag1)
   {
     cout<<"No";
     return 0;
   }
  }
  cout<<"Yes";
}