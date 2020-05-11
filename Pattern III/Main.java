#include<iostream>
using namespace std;
int main()
{
  int lines,line=1,i;
  cin>>lines;
  while(line<=lines)
  {
    for(i=1;i<=2*line-1;i++)
    {
      if(i%2==1)
        cout<<line;
      else
        cout<<"*";
    }
    cout<<"\n";
    line++;
  }
  line--;
  while(line>=1)
  {
    for(i=1;i<=2*line-1;i++)
    {
      if(i%2==1)
        cout<<line;
      else
        cout<<"*";
    }
    cout<<"\n";
    line--;
  }
}