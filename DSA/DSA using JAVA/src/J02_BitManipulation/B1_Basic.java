package J02_BitManipulation;

public class B1_Basic {
    public static void clearRange(int n,int i,int j){
        int bitmaskend=(~0)<<j+1;
        int bitmaskstart=(1<<i)-1;  //eg 2^4=1000 if (2^4-1)=0111
        int bitmask=bitmaskend|bitmaskstart;
        int clearedno=n&bitmask;
        System.out.println(clearedno);
    }

    public static int updatebit(int n,int i){
        clearbit(n,i);
        return setbit(n,i);
    }

    public static int getbit(int n,int i){
        int bitmask=1<<i;
        return n&bitmask;
    }

    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int clearbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    public static void operators(int a,int b){
        System.out.println((a&b)+"\n"+ (a|b) +"\n"+(a^b)+"\n"+(~a));
        System.out.println(a<<2);//leftshift
        System.out.println(a>>2);//rightshift for signed || for unsigned use >>>
    }

    public static void main(String args[]){
        int a=6,b=3;
        operators(a,b);
        System.out.println(getbit(5,2));
        System.out.println(setbit(5,1));
        System.out.println(clearbit(7,1));
        System.out.println(updatebit(8,2));
        clearRange(50,2,4); //1'100'10-->100010--->34
    }
}
