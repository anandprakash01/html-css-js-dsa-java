package J05_String;
import java.util.*;
public class J1_basic {
    public static void main(String[] args){
        //char a[]={'2','f'};
        String str="Anand prakash";
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
