package J02_BitManipulation;

public class J5_powerOf2 {
    public static void powerof2(int n){
        if((n&(n-1))==0){
            System.out.println("No is power of 2");
        }
        else{
            System.out.println("No is not power of 2");
        }
    }
    public static void main(String[] args){
        int n= 16;
        powerof2(n);
    }
}
