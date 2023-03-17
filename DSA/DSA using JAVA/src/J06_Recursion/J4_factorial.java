package J06_Recursion;

public class J4_factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        int x=5;
        System.out.println(factorial(x));
    }
}
