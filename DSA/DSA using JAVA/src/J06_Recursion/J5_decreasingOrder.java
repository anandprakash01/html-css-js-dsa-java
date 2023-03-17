package J06_Recursion;

public class J5_decreasingOrder {
    public static void decreasingOrder(int n){
        if(n==0){
            System.out.print("0 ");
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
    public static void main(String[] args){
        int n=36;
        decreasingOrder(n);
    }
}
