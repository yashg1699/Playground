#include<iostream>
using namespace std;
int main()
{
  int rows,cols,treeno;
  cin>>rows>>cols>>treeno;
  if(treeno>=1 && treeno<=cols)
    cout<<"Yes";
  else if(treeno%cols==1)
    cout<<"Yes";
  else if(treeno%cols==0)
    cout<<"Yes";
  else
    cout<<"No";
    
}