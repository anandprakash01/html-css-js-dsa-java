//Find the given sum in subarray of an array
#include"bits/stdc++.h"
using namespace std;

//         int last=0;
//         int j=0;
//         vector<int>res;
//         bool flag=false;
        
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//             if(sum>=s){
//                 last=i;
//                 while(sum>s && j<last){
//                     sum-=arr[j];
//                     j++;
                    
//                 }
//             if(sum==s){
//                  res.push_back(j+1);
//                  res.push_back(i+1);
//                  flag=true;
//                  return res;
            
//                 }
           
//             }
// }
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int sum;
    cin>>sum;
    int i=0, j=0, st=-1, end=-1, ans=0;
    while(j<n && ans+a[j]<=sum){
        ans+=a[j];
        j++;
    }
    if(ans==sum){
        cout<<i<<", "<<j-1<<endl;
        return 0;
    }
    while(j<n){
        ans+=a[j];
        while(ans>sum){
            ans-=a[i];
            if(ans==sum){
                st=i+1; //because the i looping has been substracted from ans so it can not be counted
                end=j;
                cout<<i+1<<", "<<j<<endl;
                break;
            }
            i++;
        }
        j++;
    }
    cout<<st<<", "<<end<<endl;
    return 0;

}