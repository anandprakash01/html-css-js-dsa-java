#include"bits/stdc++.h"
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    const int N=1e5+2;
    int idx[N];
    int minidx=INT_MAX;
    for(int i=0;i<N;i++){
        idx[i]=-1;
    }
    for(int i=0;i<n;i++){
        if(idx[a[i]]==-1){
            idx[a[i]]=i;
        }
        else{
            minidx=min(minidx,idx[a[i]]);
        }
    }

    if(minidx==INT_MAX){
        cout<<"-1";
    }
    else{
        cout<<"The index is "<<minidx<<endl
        <<"and the repeating element is "<<a[minidx]<<endl;
    }
    return 0;
}