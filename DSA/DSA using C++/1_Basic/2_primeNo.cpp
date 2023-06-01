#include <iostream>
#include<cmath>
using namespace std;

bool prime(int num) {
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    // Prime no between a and b
    int a, b;
    cin >> a >> b;
    cout << "Prime no between " << a << " and " << b << " are : ";

    // for (int i = a; i <= b; i++){
    //     int j;
    //     for (j = 2; j < i; j++){
    //         if (i % j == 0){
    //             break;
    //         }
    //     }
    //     if (j == i){
    //         cout << i << ", ";
    //     }
    // }
    for (int i = a; i < b; i++) {
        if (prime(i)) {
            cout << i << "  ";
        }
    }
    return 0;
}