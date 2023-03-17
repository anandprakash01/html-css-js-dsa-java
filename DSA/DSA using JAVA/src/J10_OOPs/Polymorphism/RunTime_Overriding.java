package J10_OOPs.Polymorphism;
        //One name multiple forms
/*      Compile time polymorphism --->    Overloading(Static)
        Run time Polymorphism     --->    Overriding(Dynamic)
*/

class Vehicle{
    String name;
    String color;

    public Vehicle() {}

    void breaks(){
        System.out.println("Breaks applied");
    }

}
class Bike extends Vehicle{
    int prize;
    void breaks(){  //Overriding method
        System.out.println("Disk breaks");
    }
}
class Aeroplane extends Vehicle{
    void breaks(){  //Overriding method
        System.out.println("Hydro-lic breaks");
    }
}
public class RunTime_Overriding {

    public static void main(String[] args){
        Vehicle v1=new Vehicle();
        v1.breaks();

        //  Object of parent class--->  reference of child class
        Vehicle v2=new Bike();
        v2.breaks();
        //v2.petrol();//can not access this coz this is an object of vehicle,and it does not have this method
        Vehicle v3=new Aeroplane();
        v3.breaks();

        Bike b=new Bike();
        b.breaks();
    }
}
