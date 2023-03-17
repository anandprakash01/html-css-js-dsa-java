package J10_OOPs.KeyWords;

class Vehicle{
    final int driverSeat=1;//final variable
    void breaks(){
        System.out.println("Breaks");
    }
}
class Bike{
    final void breaks(){    //final method
        System.out.println("Uses disc break");
    }
}
class pulser extends Bike{
//    void breaks(){
//        System.out.println("Uses hydraulic breaks");
//    }
}
public class finalKeyword {
    public static void main(String[] args){
        Bike b=new Bike();
        b.breaks();
    }
}
