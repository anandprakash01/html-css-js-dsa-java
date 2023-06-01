#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int ans=2;
    int curr=2;
    int pd=a[1]-a[0];
    int st=0;

    int counter=1;
    for(int i=2;i<n;i++){
        if(pd==a[i]-a[i-1]){
            curr++;

        }
        else{
            pd=a[i]-a[i-1];
            curr=2;
            st=counter-1;
        }
        ans=max(ans,curr);
        counter++;
    }

    // int i=2;
    // while(i<n){
    //     if(pd==a[i]-a[i-1]){
    //         curr++;
    //     }
    //     else{
    //         pd=a[i]-a[i-1];
    //         curr=2;
    //     }
    //         ans=max(ans,curr);
    //     i++;
    // }
    for(int j=st;j<ans;j++){
        cout<<a[j];
    }
    cout<<"Length is "<<ans;
    return 0;
}