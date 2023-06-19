package J08_OOPs.Inheritance;

class Animal{
    int head;
    void eats(){
        System.out.println("Eating....");
    }
}
class Dog extends Animal{
    // this is single level inheritance
    int legs;
    void bark(){
        System.out.println("Barking...");
    }
}
class Puppy extends Dog{
    // this is multilevel inheritance coz we are deriving class from derived class
        void color(){
        System.out.println("Black");
    }
}
class Cat extends Animal{
    // this is hierarchical inheritance coz multiple derived class with only one base class
    void meau(){
        System.out.println("meeaaauuu...");
    }
}

public class Inharitance {
    public static void main(String[] args){
        Animal A=new Animal();// parent class object
        A.head=1;
        A.eats();
        System.out.println("head: "+A.head);

        Dog jaggu=new Dog();    // subclass object
        jaggu.head=1;
        jaggu.legs=4;
        jaggu.bark();

        Puppy jb=new Puppy();
        jb.head=1;
        jb.color();
        jb.bark();

        Cat jwala=new Cat();
        jwala.head=1;
        jwala.eats();
        jwala.meau();
        //jwala.bark()  // can not do this;

        Animal kundru=new Dog();// Object of parent class --> reference of child class
        kundru.eats();
        //kundru.bark(); //can not use this
    }
}
