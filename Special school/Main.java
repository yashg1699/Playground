#include<iostream>
#include<algorithm>
#include<string>
#include<cstring>
using namespace std;
int main()
{
  string str1,str2;
  cin>>str1;
  cin>>str2;
  reverse(str1.begin(),str1.end());
  int r=str1.compare(str2);
  if(r==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}