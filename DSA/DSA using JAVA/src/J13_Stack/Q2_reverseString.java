package J13_Stack;

import java.util.Stack;

public class Q2_reverseString {
    //reverse a String using Stack
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result= new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str="hr_anand";
        str=reverse(str);
        System.out.println(str);
    }
}
