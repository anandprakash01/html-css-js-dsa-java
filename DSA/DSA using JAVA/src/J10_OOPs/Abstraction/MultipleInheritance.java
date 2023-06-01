package J10_OOPs.Abstraction;
            // multiple and hybrid inheritance using interface
class GrandFather{
    void play(){
        System.out.println("Play");
    }
}
interface GrandMother{
    void sing();
}
interface Father{
    void eat();
    void cook();
    void drive();
}
interface Mother extends GrandMother{
    void eat();
    void cookTasty();
}

// multiple inheritance using implements(interface)
class Child extends GrandFather implements Father,Mother{

    public void eat(){
        System.out.println("Eats");
    }
    public void cook(){
        System.out.println("Cooks avg");
    }
    public void drive(){
        System.out.println("Drive");
    }
    public void cookTasty(){
        System.out.println("Cooks awesome");
    }
    public void sing(){
        System.out.println("Sing");
    }
}
public class MultipleInheritance {
    public static void main(String[] args){
        Child meraBabu=new Child();
        meraBabu.drive();
    }
}
