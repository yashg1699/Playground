#include<iostream>
using namespace std;
int main()
{
  int lines,line=1,num=1,temp;
  cin>>lines;
  while(line<=lines)
  {
    if(line%2==1)
    {
      for(int i=1;i<=2*line-1;i++)
      {
        if(i%2==0)
        {
          cout<<"*";
        }
        else
        {
          cout<<num;
          num++;
        }
      }
      cout<<"\n";
    }
    else
    {
      for(int i=1,temp=1;i<=2*line-1;i++)
      {
        if(i%2==0)
        {
          cout<<"*";
        }
        else
        {
          cout<<num+line-temp;
          temp++;
        }
      }
      num+=line;
      cout<<"\n";
    }
    line++;
  }
}