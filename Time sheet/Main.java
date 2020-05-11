#include<iostream>
using namespace std;
int cal(int hrs)
{
  int sal;
  if(hrs<=8)
    sal=100*hrs;
  else
    sal=100*hrs+15*(hrs-8);
  return sal;
}

int main()
{
  int a,b,c,d,e,f,g,sal=0;
  cin>>a>>b>>c>>d>>e>>f>>g;
  sal+=cal(b);
  sal+=cal(c);
  sal+=cal(d);
  sal+=cal(e);
  sal+=cal(f);
  int weekdays=b+c+d+e+f;
  if(weekdays>40)
    sal+=25*(weekdays-40);
  if(a>0)
  {
    int sun=100*a;
    sal+=sun+sun/2;
  }
   if(g>0)
  {
    int sat=100*g;
    sal+=sat+sat/4;
  }
  cout<<sal;
}