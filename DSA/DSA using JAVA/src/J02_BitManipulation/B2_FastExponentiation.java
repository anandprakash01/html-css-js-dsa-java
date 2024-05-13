package J02_BitManipulation;

public class B2_FastExponentiation {
    public static void FastExponantiation(int a,int b){
        int ans=1;      //a to the powwer b
        while(b>0){
            if((b&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            b=b>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        int a=5;
        int b=3;
        FastExponantiation(a,b);
    }
}
