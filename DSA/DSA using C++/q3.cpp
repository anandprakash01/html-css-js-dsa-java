
#include<iostream>
#include<vector>
using namespace std;

vector<int> ans(vector<int> a){
    vector<int> result;
    for(int i=a.size();i<=0;i--){
        result.push_back(a[i]);
    }
    return result;  
}
int main()
{   
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i=n-1;i++){
        cin>>arr[i];
    }
    vector<int>reverse;

    for(int i=0;i<n;i++){
        cout<<reverse[i];
    }
    return 0;
}