#include"bits/stdc++.h"
//#include<iostream>
//#include<array>
using namespace std;

void printarr(int arr[], int n) {
    for (int i = 0;i < n;i++) {
        cout << arr[i] << " ";
    }cout << endl;
}

void bubbleSort(int n, int a[]) {
    for (int i = 0;i < n;i++) {
        for (int j = 0;j < n - 1 - i;j++) {          //(time complexity O(n^2))
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    // int counter=1;
    // while(counter<n){
    //     for(int i=0;i<n-counter;i++){    //Time complexity O(n^2)
    //         if(a[i]>a[i+1]){
    //             int temp=a[i];
    //             a[i]=a[i+1];
    //             a[i+1]=temp;
    //         }
    //     }
    //     counter++;
    // }
}

void selectionSort(int n, int a[]) {
    for (int i = 0;i < n - 1;i++) {
        int minpos = i;
        for (int j = i + 1;j < n;j++) {
            if (a[minpos] < a[j]) {
                minpos = j;
            }
        }
        int temp = a[i];
        a[i] = a[minpos];
        a[minpos] = a[i];
    }
}

void InsertionSort(int a[], int n) {
    // for(int i=1;i<n;i++){
    //     int curr=a[i];
    //     int pre=i-1;
    //     while(pre>=0 && a[pre]>curr){
    //         a[pre+1]=a[pre];
    //         pre--;
    //     }
    //     a[pre+1]=curr;
    // }
    // return;

    for (int i = 1;i < n;i++) {
        int key = a[i];
        int j = i - 1;
        for (;j >= 0;j--) {
            if (a[j] >= key) {
                a[j + 1] = a[j];
            }
            else {
                a[j + 1] = key;
                break;
            }
        }
        if (j < 0) {
            a[0] = key;
        }

    }
}

int main() {
    // int n;
    // cin>>n;
    // int a[n];
    // for(int i=0;i<n;i++){
    //     cin>>a[i];
    // }
    int arr[] = { 2,3,6,5,10,8 };
    int m = end(arr) - begin(arr);
    cout << m << endl;
    cout << arr << endl;//this will give start address
    printarr(arr, m);
    //selectionSort(m,arr);
    //bubbleSort(m,arr);
    InsertionSort(arr, m);
    printarr(arr, m);
}