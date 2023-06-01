#include"bits/stdc++.h"
using namespace std;
void checkpalindrom(char arr[],int n){
    bool check=true;
    for(int i=0;i<n;i++){

        //it will run for every i
        //if(arr[i]==a[n-1-i]){
        //   check=0;
        //}
        if(arr[i]!=arr[n-1-i]){
            check=false;
            break;
        }
    }
    if(check)
        cout<<arr<<" is a palindrome "<<endl;
    else{
        cout<<arr<<" is not a palindrome ";
        }
}
int main()
{
    // char anand[100]="A-N-A-N-D";
    // int x=0;
    // while(anand[x] != '\0'){
    //     cout<<anand[x];
    //     x++;
    // }
    // cout<<endl;
    int n;
    cin>>n;
    char arr[n+1];
    cin>>arr;
    cout<<arr<<endl;
    checkpalindrom(arr,n);
    return 0;

}