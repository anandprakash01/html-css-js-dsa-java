#include"bits/stdc++.h"
//#include<iostream>
// #include<array>
using namespace std;

void printarr(int arr[], int n) {
    for (int i = 0;i < n;i++) {
        cout << arr[i] << " ";
    }cout << endl;
}
void arrangeZero() {
    int arr[] = { 2,0,1,0,1,2,1,0,0,1,0,2,0,1 };
    int low = 0;  //for zeros
    int mid = 0;  //for ones
    int high = end(arr) - begin(arr) - 1;     //for twos
    while (mid <= high) {
        switch (arr[mid]) {
        case 0:
            swap(arr[mid++], arr[low++]);
            break;
        case 1:
            mid++;
            break;
        case 2:
            swap(arr[mid], arr[high--]);
            break;
        }
    }
    printarr(arr, end(arr) - begin(arr));
    // for(int i=0;i<end(arr)-begin(arr);i++){
    //     cout<<arr[i]<<" ";
    // }

//    int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
            // Count the number of 0s, 1s and 2s in the array
//     for (i = 0; i < n; i++) {
//         switch (arr[i]) {
//         case 0:
//             cnt0++;
//             break;
//         case 1:
//             cnt1++;
//             break;
//         case 2:
//             cnt2++;
//             break;
//         }
//     }
//     // Update the array
//     i = 0;
//     // Store all the 0s in the beginning
//     while (cnt0 > 0) {
//         arr[i++] = 0;
//         cnt0--;
//     }
//     // Then all the 1s
//     while (cnt1 > 0) {
//         arr[i++] = 1;
//         cnt1--;
//     }
//     // Finally all the 2s
//     while (cnt2 > 0) {
//         arr[i++] = 2;
//         cnt2--;
//     }
//     // Print the sorted array
//     printArr(arr, n);
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
    arrangeZero();
    return 0;
}