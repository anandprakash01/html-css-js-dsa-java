#include"bits/stdc++.h"
#include<string>
using namespace std;

void basic(){
    string str="Anand Prakash\n ~Fortis fortuna adiuvat";
    cout<<str<<endl;
    // string strg;
    // cin>>strg; //only one word
    // cin.ignore();
    // cout<<strg<<endl;
    // string s1(5,'D');
    //     //we can only add a character x times;
    //     //string s2(5,"Demo");  this is wrong we can not use word
    // cout<<s1<<endl;
    // string s2;
    // getline(cin,s2);
    // cout<<s2<<endl;
        //appending two string
    string s4="Anand";
    cout<<s4[0]<<endl;
    string s5="Prakash";
    cout<<s4+s5<<endl;
    cout<<s5.append(s4)<<endl;
    s4.clear();             //clears the string
    cout<<s5.append(s4)<<endl;
            //compare
    string s6="Brave";
    if(s5.compare(s6)==0){
        cout<<"string s5 and s6 are equal"<<endl;
    }
    else{
        cout<<"not equal"<<endl;
    }
    s6.erase(1,2);          //after 1 character (ie.from 1st index) remove 2 character
    cout<<s6<<"\n";
    cout<<s5.find("sh")<<"\n";
    cout<<s6.insert(1,"ra")<<endl;
    cout<<s6.size()<<endl;  // or s6.length
    cout<<s6.substr(1,3)<<endl;
    string s7="90";
    int x=stoi(s7);         // string to integer
    int y='a';
    int z='A';
    cout<<x<<endl<<y<<", "<<z<<", "<<(y-z)<<endl;

    string s=to_string(x);  //integer to string
            //sorting of a string
    string s9="cxa hzeb";   //spaces will move to front
    sort(s9.begin(),s9.end());
    cout<<s9<<endl;

}
void toUpper(){
        // a=97, A=65 : a-A=32
    string str="FoRTis";
    string s1="ForTUna";
    for(int i=0;i<str.size();i++){
        if(str[i]>='a' && str[i]<='z'){
            str[i]-=32;
        }
    }
    cout<<str<<"\n";
    //for direct transformation
    transform(s1.begin(),s1.end(),s1.begin(),::toupper);
    cout<<s1<<endl;
}       

void toLower(){
    string s1="AdiUVat";
    string s2="brAvE";
    for(int i=0;i<s1.size();i++){
        if(s1[i]>='A' && s1[i]<='Z'){
            s1[i]+=32;
        }
    }
    cout<<s1<<endl;
        //for direct transformation
    transform(s2.begin(),s2.end(),s2.begin(),::tolower);
    cout<<s2<<endl;
}

int main()
{
    basic();
    toUpper();
    toLower();
    return 0;
}