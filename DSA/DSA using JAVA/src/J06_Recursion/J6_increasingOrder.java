package J06_Recursion;

public class J6_increasingOrder {
    static void increasingOrder(int n){
        if(n==0){
            System.out.print(0+" ");
            return ;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
        return;
    }
    public static void main(String args[]){
        increasingOrder(5);
    }
}
