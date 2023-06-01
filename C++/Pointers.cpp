#include<iostream>
using namespace std;
int main()
{
    int a=10;
    int* b=&a;
    cout<<"The address of a is "<<b<<endl;
    cout<<"the address of a is "<<&a<<endl;

        //*****Dereference Operator*****

    cout<<"the value at address b is "<<*b<<endl;

    //Pointer to Pionter 
    int **c=&b;
    cout<<"The address of b is "<<&b<<endl;
    cout<<"The address of b is "<<c<<endl;
    cout<<"The value at address c is "<<*c<<endl;
    cout<<"The value of address value_at(value_at c) "<<**c<<endl; //Dereference two times

    int n=4;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int* p=arr;
    cout<<*p++<<endl;
    cout<<*p<<endl;
    cout<<*++p<<endl;
    
    // cout<<"Value of *P is "<<*p<<endl;
    // cout<<"Value of *(p+1) is "<<*(p+1)<<endl;
    // cout<<"Value of *(p+2) is "<<*(p+2)<<endl;
    // cout<<"Value of *(p+3) is "<<*(p+3)<<endl;



    return 0;

}