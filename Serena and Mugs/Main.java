#include<iostream>
using namespace std;
int main()
{
  
  int a,s,sum=0;
  cin>>a>>s;
  int arr[a];
  for(int i=0;i<a;i++){
  cin>>arr[i];
    sum=sum+arr[i];
  }
    if(sum<=s){
    cout<<"YES";
    }
  else{
  cout<<"NO";
  }
}