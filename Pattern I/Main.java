#include<iostream>
using namespace std;
int main()
{
  int input,line,i;
  cin>>input;
  for(line=1;line<=4;line++,input++)
  {
    for(i=1;i<=line;i++)
      cout<<input;
    cout<<"\n";
  }
  input--;
  line--;
  while(line>=1)
  {
    for(i=line;i>=1;i--)
      cout<<input;
    cout<<"\n";
    line--;
    input--;
  }
}