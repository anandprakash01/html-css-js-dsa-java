#include<iostream>
#include<cmath>
using namespace std;

void desitobin() {
    int n;
    cout << "Enter a desimal no: ";
    cin >> n;
    // int ans[100];
    // int i=0;
    // while(n>0){
    //     ans[i]=n%2;
    //     n/=2;
    //     i++;
    // }
    // for(int j=i-1;j>=0;j--){
    //     cout<<ans[j];
    // }

        //without storing on array
    // int number=0;
    // while(n>0){
    //    int remender=n%2;
    //    number=(number*10)+remender;
    //             /*this will only give u the 1's if
    //             if no totally divisible by 2
    //             because if u add remender 0 to result it will
    //             always be 0 till remender 1 is come */
    //     n/=2;
    // }
    //         // we can use pow fun to minimise this step

    int number = 0;
    int power = 1;
    while (n > 0) {
        int remender = n % 2;
        //number=number+(remender*pow(10,power));
        //power++;
        number += remender * power;
        power *= 10;
        n /= 2;
    }
    cout << number << endl;
}

void bintodesi() {
    cout << "Enter a binary no: ";
    int n;
    cin >> n;
    int result = 0;
    int i = 0;
    while (n > 0) {
        int last = n % 10;
        // result+=last*2;
        // i*=2;
        result += last * (pow(2, i));
        i++;
        n /= 10;
    }
    cout << result << endl;
}

int main() {
    desitobin();
    //bintodesi();
    return 0;
}