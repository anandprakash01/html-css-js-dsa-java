package J08_OOPs.AccessModifiers.PakageB;

import J08_OOPs.AccessModifiers.Animal; //Animal should be public so that we can import class
class Cat extends Animal{
    //default
//    void fun(){
//        int l=legs;   //can not access in derived class
//        eat();
//    }

    //protected

    void fun(){
        int h=head;     //can be accessed in derived class
        eye();
    }
}
public class TestAccessModifiers {
    public static void main(String[] args){
        Animal a=new Animal();
        //default
//        a.legs=4    //we can not access this outside package
//        a.eat();

        //protected
//        a.head=1;   //we can not access this outside package
//        a.eye();

    }
}
