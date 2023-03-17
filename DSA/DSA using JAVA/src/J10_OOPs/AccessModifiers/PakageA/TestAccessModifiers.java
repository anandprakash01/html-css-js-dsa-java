package J10_OOPs.AccessModifiers.PakageA;


class Animal{
    //default
    int legs;
    void eat(){
        System.out.println("Eating...");
    }

    //protected
    protected int head;
    protected void eye(){
        System.out.println("Two Eyes");
    }
}
class Dog extends Animal{

//    default
//    void fun(){
//        int l=legs;
//        eat();
//    }

//    protected
    void fun(){
        int h=head;
        eye();
    }

}
public class TestAccessModifiers {
    public static void main(String[] args){

        Animal a=new Animal();
        // default
        a.legs=4;
        a.eat();

//        protected
        a.head=1;
        a.eye();

    }
}
