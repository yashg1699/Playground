#include<iostream>
using namespace std;
struct Distance{
int feet;
  float inch;
};
int main()
{
  Distance d1,d2,r;
  cin>>d1.feet;
  cin>>d1.inch;
  cin>>d2.feet;
  cin>>d2.inch;
  r.feet=d1.feet+d2.feet;
  r.inch=d1.inch+d2.inch;
  if(r.inch>=12){
  r.inch=r.inch-12;
    r.feet++;
  }
    cout<<r.feet<<"'-"<<r.inch<<"\"";
}