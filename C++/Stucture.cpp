#include<iostream>
using namespace std;
// struct employee
// {
//     int eId;
//     char favchar;
//     float salary;
// };
//  int main()
//  {
//      struct employee anand;
//      anand.eId=1;
//      anand.favchar='myself';
//      anand.salary=100;


//  }
typedef struct employee
{
    int eId;
    char favchar;
    float salary;
}ep;
 int main()
 {
     ep anand;
     anand.eId=12;
     anand.favchar='F';
     anand.salary=100;

    cout<<anand.eId<<endl<<anand.favchar<<endl<<anand.salary<<endl;

    return 0;
 }