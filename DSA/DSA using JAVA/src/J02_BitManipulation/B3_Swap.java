package J02_BitManipulation;

public class B3_Swap {
    public static void swap(int x,int y){
        x=x^y;
        y=x^y;      //x^y ^y        coz x^x=0 always
        x=x^y;      //x^y ^x
    }
    public static void main(String[] args){
        int a=5;
        int b=6;
        System.out.println(a+" "+b);
    }
}
