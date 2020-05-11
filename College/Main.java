#include<iostream>
using namespace std;
struct college{
char name[30];
  char city[20];
  int yoe;
  float pa;
};
int main()
{
  int n,i=0;
  college s[10];
  cout<<"Enter the number of colleges";
  cin>>n;
  while(i<n){
    cout<<"\nEnter the details of college "<<i+1;
  cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter city";
    cin>>s[i].city;
    cout<<"\nEnter year of establishment";
    cin>>s[i].yoe;
    cout<<"\nEnter pass percentage";
    cin>>s[i].pa;
    i++;
  }
  cout<<"\nDetails of colleges";
  for(int j=0;j<n;j++)
  {
   cout<<"\nCollege:"<<j+1;
    cout<<"\nName:"<<s[j].name;
    cout<<"\nCity:"<<s[j].city;
    cout<<"\nYear of establishment:"<<s[j].yoe;
    cout<<"\nPass percentage:"<<s[j].pa;
  }
}