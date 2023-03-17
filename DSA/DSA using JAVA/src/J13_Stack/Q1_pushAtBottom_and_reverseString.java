package J13_Stack;

import java.util.Stack;

public class Q1_pushAtBottom_and_reverseString {

    public static void pushAtBottom(Stack<Integer> s,int data){     //Using recursion
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val= s.pop();
        pushAtBottom(s,data);
        s.push(val);

    }

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
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(3);
        s.push(5);
        pushAtBottom(s,10);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }System.out.println();

        String str="hr_anand";
        str=reverse(str);
        System.out.println(str);

    }



}
