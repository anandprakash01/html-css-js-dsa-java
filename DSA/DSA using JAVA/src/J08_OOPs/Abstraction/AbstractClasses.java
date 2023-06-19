package J08_OOPs.Abstraction;

abstract class Vehicle{     //we can get 0 to 100% abstraction
    String color;
    Vehicle(){
        color="Black";
        System.out.println("Vehicle constructor called.......");
    }
    void horn(){
        System.out.println("popoo...");
    }
    abstract void breaks();//to use abstract method we need to make class also as abstract

}
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike constructor called.......");
    }
    //Class 'Bike' must either be declared abstract or implement abstract method 'breaks()' in 'Vehicle'
    void breaks(){
        System.out.println("Uses disc breaks");
    }
    void changeColor(){
        color="Matt black";
    }
}
class Scooty extends Vehicle{
    void breaks(){
        System.out.println("uses Girls foot to stop😂, but boys can use Breaks");
    }
    void changeColor(){
        color="Pink";
    }
}

public class AbstractClasses {
    public static void main(String[] args){
        // we can not create instance of abstract class
//        Vehicle v= new Vehicle() {
//            @Override
//            void breaks() {// or we have to implement the abstract method here
//
//            }
//        };
        Bike b=new Bike();
        b.breaks();

    }
}
