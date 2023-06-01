#include"bits/stdc++.h"
using namespace std;
int main()
{
    int n,m;
    cin>>n>>m;
    int a[n][m];            // matrix should be in sorted order
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        cin>>a[i][j];
    }
    int key;
    cin>>key;
    int r=0,c=m-1;
    bool found=0;
    while(r<n && c>=0){
        if(a[r][c]==key){
            found=1;
            cout<<"No is found at "<<r<<","<<c<<endl;
            break;
        }
        if(a[r][c]>key){
            c--;
        }
        else{
            r++;
        }
    }
    if(found){
        cout<<"No is found at "<<r<<","<<c<<endl;
    }
    else{
        cout<<"No is not found"<<endl;
    }
    return 0;
}