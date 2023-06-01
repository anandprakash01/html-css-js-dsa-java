#include<iostream>
using namespace std;

class student{
    protected:
    int roll_number;
    public:
    void setroll_number(int);
    void getroll_number();
};
void student::setroll_number(int r){
    roll_number=r;
}
void student::getroll_number(){
    cout<<"The roll no is "<<roll_number<<endl;
}

class exam: public student{
    protected:
    float physics;
    float math;
    public:
    void setmarks(float m1, float m2){
        physics=m1;
        math=m2;
    }
    void getmarks();
};
void exam::getmarks(){
    cout<<"The marks obtained in physics are: "<<physics<<endl;
    cout<<"The marks optained in math are: "<<math<<endl;
}

class result: public exam{
    float percentage;
    public:
    void display_result(){
        getroll_number();
        getmarks();
        cout << "Your result is " << (math + physics) / 2 << "%" << endl;

    }

};

int main()
{
    result harry;
    harry.setroll_number(45);
    harry.setmarks(95.0 , 99.0);
    harry.display_result();
    return 0;
}