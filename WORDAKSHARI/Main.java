#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  
  cin>>s;
  cout<<s<<endl;
  
  char a=s[s.size()-1];
  
  while(1)
  {
    cin>>s;
    if(s=="####")
      break;
    if(a!=s[0])
      break;
    cout<<s<<endl;
    a=s[s.size()-1];
  }
}