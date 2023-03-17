package J06_Recursion;

public class J2_nthFibo {
    static int nthFibonacci(int n){
        if(n==0 ||n==1){
            return n;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
    public static void main(String[] args){
        int n=6;
        int fibo=nthFibonacci(n);
        System.out.println(fibo);
    }
}
