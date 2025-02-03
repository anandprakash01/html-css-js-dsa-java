package J05_String;
import java.util.*;
public class S1_Basic {
    public static void main(String[] args){
        //char a[]={'2','f'};
        String str="Anand";
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int len=s1.length();
        System.out.println(s1);
        //------>concatenation/appending
        String s2=str+" "+s1;
        System.out.println(s2);
        str.charAt(0);
        str.equals(s1);
    }
}
