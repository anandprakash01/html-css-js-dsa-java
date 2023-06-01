#include"bits/stdc++.h"
using namespace std;
int main()
{
    int a=10;
    int *aptr=&a;
    cout<<aptr<<endl;
    cout<<*aptr<<endl;
    cout<<&a<<endl;
    *aptr=30;
    cout<<a<<endl;

    int arr[]={3,5,6,3,4};
    cout<<*arr<<endl;
    int *ptr=arr;
    for(int i=0;i<5;i++){
        cout<<*ptr<<" ";
        ptr++;
    }
    cout<<endl;

    for(int i=0;i<5;i++){
        cout<<*(arr+i)<<" ";
    }
    //pointer to pointer
    int x=38;
    int *p=&x;
    cout<<p<<endl;
    cout<<*p<<endl;
    int **q=&p;
    cout<<*q<<endl;
    cout<<**q<<endl;
    return 0;
}