package J06_Recursion;

public class J3_sumTill {
    public static int sum(int n){
        //sum of 1st n natural no
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        int x=6;
        System.out.println(sum(x));
    }
}
