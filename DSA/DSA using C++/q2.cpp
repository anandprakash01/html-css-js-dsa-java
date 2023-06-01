//Wave sort
#include<iostream>
using namespace std;

void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

void wave(int arr[], int n){
    for(int i=1;i<n;i+=2){
        if(arr[i]>arr[i-1]){
            swap(arr,i,i-1);
        }
        if (arr[i]>arr[i+1] && i<=n-2){
            swap(arr,i,i+1);
        }
        
    }
}
int main()
{
    int arr[]={3,2,1,4,6};
    wave(arr,5);
    for(int i=0;i<5;i++){
        cout<<arr[i]<<" ";

    }
    return 0;

}