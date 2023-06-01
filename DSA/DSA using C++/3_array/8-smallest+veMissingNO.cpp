#include"bits/stdc++.h"
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    int ans;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    const int N=1e4+1;
    bool idx[N];
    for(int i=0;i<N;i++){
        idx[i]=false;
    }
    int j=0;
    while(j<n){
        if(a[j]>0){
            idx[a[j]]=true;
        }
        j++;
    }
    for(int i=1;i<N;i++){
        if(idx[i]==false){
            ans=i;
            cout<<i<<endl;
            break;
        }
    }
    cout<<"The missing no is "<<ans<<endl;
    return 0;
}