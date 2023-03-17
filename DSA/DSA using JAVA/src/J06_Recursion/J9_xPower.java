package J06_Recursion;

public class J9_xPower {
    public static int xpower(int x,int n){
        if(n==0){
            return 1;
        }
        // return x*xpower(x,n-1);
        //Optimized
        int half=xpower(x,n/2);
        int ans=half*half;
        if(n%2!=0){
            ans*=x;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(xpower(2,6));
    }
}
