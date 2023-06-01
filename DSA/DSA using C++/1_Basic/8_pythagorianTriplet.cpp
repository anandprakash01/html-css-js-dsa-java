#include<iostream>
using namespace std;
bool istriplet(int a, int b, int c) {
    int x, y, z;
    x = max(a, max(b, c));
    if (x == a) {
        y = b;
        z = c;
    }
    else if (x == b) {
        y = a;
        z = c;
    }
    else {
        y = a;
        z = b;
    }
    if (x * x == (y * y + z * z)) {
        return true;
    }
    else {
        return false;
    }
}

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    if (istriplet(a, b, c)) {
        cout << "This is pythogorian triplet";
    }
    else {
        cout << "Not pythogrian triplet";
    }
    return 0;
}