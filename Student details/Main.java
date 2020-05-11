#include <iostream>
#include<cstring>
using namespace std;

struct student
{
    char name[30];
    char dept[30];
    int yearOfStudy;
    float cgpa;
} s[10],t;

int main()
{
  int n;
    cout << "Enter the number of students" << endl;
    cin>>n;
    for(int i = 0; i <n; ++i)
    {
      cout << "Enter the details of student "<<i+1<<endl;
        cout << "Enter name "<<endl;
        cin >> s[i].name;
        cout << "Enter department "<<endl;
        cin >> s[i].dept;
        cout << "Enter year of study "<<endl;
        cin >> s[i].yearOfStudy; 
        cout << "Enter cgpa "<<endl;
        cin >> s[i].cgpa;
    }
    for(int i=0;i<n;i++)
     {
          for(int j=i+1;j<n;j++)
          {
               if(strcmp(s[i].name,s[j].name)>0)
               {
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
               }
          }
     }
    cout << "Details of students " << endl;

    for(int i = 0; i < n; ++i)
    {
        cout << "Student " << i+1 << endl;
        cout << "Name:" << s[i].name << endl;
        cout << "Department:" << s[i].dept << endl;
        cout << "Year of study:" << s[i].yearOfStudy << endl;
        cout << "CGPA:" << s[i].cgpa << endl;
    }

    return 0;
}