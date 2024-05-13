package J02_BitManipulation;

public class B4_SetBits {
    public static void countsetbit(int n){
        int count=0;
        // while(n>0){
        //     if((n&1)==1){
        //         count++;
        //     }
        //     n=(n>>1);
        // }
        while(n>0){
            n=n&n-1;
            //(n&n-1) has same bit as n except the rigth most set bit
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int a=5;
        countsetbit(a);
    }
}
