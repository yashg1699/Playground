#include<iostream>
#include<cmath>
int main()
{
  int m,n,req;
  
  std::cin>>m>>n>>req;
  int exp=pow(m,n);
  if(exp>=req)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}
  