#include<iostream>
using namespace std;
struct timee{
int hr;
  int min;
  int sec;
};
int main()
{
  timee t1,t2,r;
  cin>>t1.hr>>t1.min>>t1.sec;
  cin>>t2.hr>>t2.min>>t2.sec;
  r.hr=t1.hr-t2.hr;
  
  if(t2.min>t1.min){
  r.min=60-(t2.min-t1.min);
    r.hr--;
  }
  else{
  r.min=t1.min-t2.min;
  }
  if(t2.sec>t1.sec){
  r.sec=60-(t2.sec-t1.sec);
    r.min--;
  }
  else{
  r.sec=t1.sec-t2.sec;
  }
  
  cout<<r.hr<<":"<<r.min<<":"<<r.sec;
}