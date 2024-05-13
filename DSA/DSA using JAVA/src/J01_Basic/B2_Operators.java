package J01_Basic;

public class B2_Operators {
    public static void main(String args[]){
        int a=10;
        int b=++a;
        // a=11 and b=11
        System.out.println(a);
        System.out.println(b);
        int x=10;
        int y=x++;
        //x=11 and y=10
        System.out.println(x + "\n" + y);
        System.out.println(a>b);
        System.out.println( !(a>b));
        System.out.println( (a==b) && (x>y));
    }
}
