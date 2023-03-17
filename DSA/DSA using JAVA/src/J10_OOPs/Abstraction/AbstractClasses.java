package J10_OOPs.Abstraction;

abstract class Vehicle{     //we can get 0 to 100% abstraction
    void horn(){
        System.out.println("popoo...");
    }
    abstract void breaks();//to use abstract method we need to make class also as abstract

}
class Bike extends Vehicle{
    //Class 'Bike' must either be declared abstract or implement abstract method 'breaks()' in 'Vehicle'
    void breaks(){
        System.out.println("Uses disc breaks");
    }
}

public class AbstractClasses {
    public static void main(String[] args){
//        Vehicle v= new Vehicle() {        //we can not create abstract class object
//            @Override
//            void breaks() {           // or we have to implement the abstract method here
//
//            }
//        };
        Bike b=new Bike();
        b.breaks();

    }
}
