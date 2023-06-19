package J08_OOPs.Polymorphism;
        //One name multiple forms
/*      Compile time polymorphism --->    Overloading(Static)
        Run time Polymorphism     --->    Overriding(Dynamic)
*/
class Vehicle{
    String name;
    String color;
    public Vehicle() {}
    void breaks(){System.out.println("Breaks applied");}
}

class Bike extends Vehicle{
    int prize;
    String oil;
    //Overriding method
    void breaks(){System.out.println("Disk breaks");}
}

class Aeroplane extends Vehicle{
    //Overriding method
    void breaks(){System.out.println("Hydro-lic breaks");}
}

public class RunTime_Overriding {

    public static void main(String[] args){
        Vehicle v1=new Vehicle();
        v1.breaks();

        //  Object of parent class--->  reference of child class
        Vehicle v2=new Bike();
        v2.breaks();
//        System.out.println(v2.oil);
        // can not access this coz this is an object of vehicle,and it does not have oil
        Vehicle v3=new Aeroplane();
        v3.breaks();

        Bike b=new Bike();
        b.breaks();
        System.out.println(b.oil);
    }
}
