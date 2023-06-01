#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int sum = 0;
    int originaln = n;
    while (n > 0)
    {
        int lastdigit = n % 10;
        //sum += (lastdigit*lastdigit*lastdigit);
        sum += round(pow(lastdigit, 3)); //round returns the equivalent int
        n = n / 10;
    }
    if (sum == originaln)
    {
        cout << "armstrong";
    }
    else
    {
        cout << "not armstrong";
    }
    return 0;
}