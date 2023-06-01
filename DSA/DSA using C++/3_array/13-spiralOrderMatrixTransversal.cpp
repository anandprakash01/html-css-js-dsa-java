#include"bits/stdc++.h"
using namespace std;
int main()
{
    int n,m;
    cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        cin>>a[i][j];
    }
    int row_start=0;
    int row_end=n-1;
    int coloum_start=0;
    int coloum_end=m-1;
    while(row_start<=row_end && coloum_start<=coloum_end){
        for(int col=coloum_start;col<=coloum_end;col++){
            cout<<a[row_start][col]<<" ";
        }

        for(int row= row_start+1;row<=row_end;row++){
            cout<<a[row][coloum_end]<<" ";
        }

        for(int col=coloum_end-1;col>=coloum_start;col--){
            if(row_start==row_end){
                break;
            }
            cout<<a[row_end][col]<<" ";
        }
        for(int row=row_end-1;row>=row_start;row--){
            if(coloum_start==coloum_end){
                break;
            }
            cout<<a[row][coloum_start]<<" ";
        }
        row_start++;
        coloum_end--;
        row_end--;
        coloum_start++;

    }
    return 0;
}