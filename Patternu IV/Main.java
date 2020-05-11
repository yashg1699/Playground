#include <iostream>
using namespace std;
int main() {
    int lines,line,i;
  cin>>lines;
  line=1;
  while(line<=lines)
  {
    if(line%2==1)
    {
      for(i=1;i<lines;i++)
        cout<<line;
      cout<<line+1;
    }
    else
    {
      cout<<line+1;
       for(i=1;i<lines;i++)
        cout<<line;
    }
    cout<<"\n";
    line++;
  }
  return 0;
}