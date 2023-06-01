#include<iostream>
#include<fstream>

using namespace std;

int main(){
    string st = "Harry bhai";
    // Opening files using constructor and writing it
    ofstream out("sample_Input.txt"); // Write operation
    out<<st;

    string st2;
    // Opening files using constructor and reading it
    ifstream in("sample_Output.txt"); // Read operation
    // in>>st2;
    getline(in, st2);
    getline(in, st2);
    cout<<st2;

    return 0;
}

