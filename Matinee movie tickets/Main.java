#include<iostream>
using namespace std;
int main()
{
  int age;
  float time,mt;
  cin>>age>>time;
  mt=13.30;
  if(age>13)
  {
    if(time==mt)
      cout<<"$5.00";
    else 
      cout<<"$8.00";
  }
  else
  {
    if(time==mt)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}