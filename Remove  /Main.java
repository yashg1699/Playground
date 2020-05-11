#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  if (str.find("the ") != string::npos) 
    { 
        int p = -1; 
  
        while ((p = str.find("the ")) != string::npos) 
            str.replace(p, 4, "");
  }
  cout<<str;
}