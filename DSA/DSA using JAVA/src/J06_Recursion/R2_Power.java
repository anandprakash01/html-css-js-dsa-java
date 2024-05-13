package J06_Recursion;

public class R2_Power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // return x*power(x,n-1);
        //Optimized
        int half=power(x,n/2);
        int ans=half*half;
        if(n%2!=0){
            ans*=x;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(power(2,6));
    }
}
