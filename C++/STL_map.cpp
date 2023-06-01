#include<iostream>
#include<map>
#include<string>

using namespace std;
 
int main(){
    // Map is an associative array
    map<string, int>  marksMap;
    marksMap["Atul"] = 58;
    marksMap["Rohit"] = 57;
    marksMap["Kishlay"] = 78;
    marksMap["Aditya"] = 65;
    marksMap["Sachin"] = 53;
 
    map<string,int> :: iterator iter;
    for (iter = marksMap.begin(); iter != marksMap.end(); iter++){
        cout<<(*iter).first<<" "<<(*iter).second<<"\n";
        }
    // cout<<endl;
    cout<<"The size is: "<<marksMap.size()<<endl
    <<endl;

    marksMap.insert( { {"Rohan", 89}, {"Akshat", 46} } );       // to insert a key value pair

    for (iter = marksMap.begin(); iter != marksMap.end(); iter++){
        cout<<(*iter).first<<" "<<(*iter).second<<"\n";
        }
    cout<<"The size is: "<<marksMap.size()<<endl;
    cout<<"The max size is: "<<marksMap.max_size()<<endl;

    return 0;
}
