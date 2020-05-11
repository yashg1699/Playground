#include<iostream>
using namespace std;
int main()
{
  int rail;
  std::string str;
  std::cin>>str>>rail;
  if(str=="front")
  {
    if(rail==1)
    {
    std::cout<<"Left Handed";
    }
    else
     std::cout<<"Right Handed"; 
  }
 
   else if(str=="rear")
  {
     if(rail==1)
    std::cout<<"Right Handed";
     else
        std::cout<<"Left Handed";
  }
  
}