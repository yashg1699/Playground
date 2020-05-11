#include<iostream>
using namespace std;
int main()
{
  int m,n,max=0,pos;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
  {
    int rowsum=0;
    for(int j=0;j<n;j++)
      rowsum+=a[i][j];
    cout<<rowsum<<" ";
    if(rowsum>max)
    {
      max=rowsum;
      pos=i+1;
    }
  }
  cout<<"\nRow "<<pos<<" has maximum sum";
  max=0;
  cout<<"\nSum of columns is ";
  for(int i=0;i<n;i++)
  {
    int colsum=0;
    for(int j=0;j<m;j++)
      colsum+=a[j][i];
    cout<<colsum<<" ";
    if(colsum>max)
    {
      max=colsum;
      pos=i+1;
    }
  }
  cout<<"\nColumn "<<pos<<" has maximum sum";
}