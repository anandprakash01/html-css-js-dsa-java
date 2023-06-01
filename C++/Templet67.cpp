                // Member Function Templates & Overloading

#include<iostream>
using namespace std;
// template <class T>
// class Harry
// {
// public:
//     T data;
//     Harry(T a)
//     {
//         data = a;
//     }
//     void display();
// };
 
// template <class T>
// void Harry<T> :: display(){
//     cout<<data;
// }
void func(int a){
    cout<<"I am first func() "<<a<<endl;
}
 
template<class T>               //Overloading
void func(T a){
    cout<<"I am templatised func() "<<a<<endl;
}

int main()
{
    // Harry<int> h(5.7);
    // cout << h.data << endl;
    // h.display();

    func(4);  //Exact match takes the highest priority
    func(4.5);
    return 0;
}
