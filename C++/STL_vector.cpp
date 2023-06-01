#include<iostream>
#include<vector>
using namespace std;

template <class T> //We can use it as templet also
void display(vector<T> &v){
    for (int i = 0; i < v.size(); i++)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main(){ 
    vector<int> vec1;
    int element, size;
    cout<<"Enter the size of your vector"<<endl;
    cin>>size;
    for (int i = 0; i < size; i++)
    {
        cout<<"Enter an element to add to this vector: ";
        cin>>element;
        vec1.push_back(element);  // it inserts the element in Vector
    }
    display(vec1);
    vec1.pop_back(); // it removes the last element
    display(vec1);

    vector<int> :: iterator iter = vec1.begin();
    vec1.insert(iter,566);
    display(vec1);
    vec1.insert(iter+1,80);
    display(vec1);
    vec1.insert(iter+2,10,50);  //not working with size 4
    display(vec1);

    // vector<int> vec1;      //zero length integer vector
    // vector<char> vec2(4);  //4-element character vector
    // vector<char> vec3(vec2);//4-element character vector from vec2
    vector<int> vec4(6,3); //6-element vector of 3s
    display(vec4);

    return 0;
}
