#include<iostream>
using namespace std;
int main()
{
  int dollar1,cent1,dollar2,cent2,dollar,cent;
  cin>>dollar1>>cent1>>dollar2>>cent2;
  dollar=dollar1+dollar2;
  cent=cent1+cent2;
  if(cent>=100)
  {
    dollar+=cent/100;
    cent=cent%100;
  }
  cout<<dollar<<"\n"<<cent;
}