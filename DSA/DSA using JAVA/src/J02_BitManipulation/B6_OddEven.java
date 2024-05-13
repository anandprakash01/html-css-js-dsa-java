package J02_BitManipulation;

public class B6_OddEven {
    public static void checkEvenOdd(int n){
        int bitmask=1;
        if((n&1)!=0){       //coz last bit of even no is 0, and 1 for odd
            System.out.println("Odd no.");
        }
        else{
            System.out.println("Even no.");
        }
    }
    public static void main(String[] args){
        int x=45;
        checkEvenOdd(x);
    }
}
