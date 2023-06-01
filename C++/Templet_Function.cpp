#include<iostream>
using namespace std;
 
// float funcAverage(int a, int b){
//     float avg= (a+b)/2.0; 
//     return avg;
// }
template<class T1, class T2>
float funcAverage(T1 a, T2 b){
    float avg= (a+b)/2.0; 
    return avg;
}
template <class T>
void swapp(T &a, T &b){
    T temp = a;
    a = b;
    b = temp;
}
int main(){
    float a;
    a = funcAverage(5,2);
    printf("\n The average of these numbers is %f \n",a);
    int x=7,y=4;
    swapp(x,y);
    cout<<x<<endl<<y;

return 0;

}
