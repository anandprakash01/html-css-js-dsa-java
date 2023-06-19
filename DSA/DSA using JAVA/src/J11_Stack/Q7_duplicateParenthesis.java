package J11_Stack;

import java.util.Stack;

public class Q7_duplicateParenthesis {
    // Given a balanced expression(valid string) , find if it contains duplicate parentheses or not
    // A set of parentheses are duplicate if the same expression is surrounded by multiple parentheses
    public static boolean isDuplicate(String s){
        Stack<Character> S=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //for closing
            if(ch==')' || ch=='}' || ch==']'){
                int count=0;
                while(S.peek()!='(' && S.peek()!='{' && S.peek()!='['){
                    S.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate
                }else{
                    S.pop(); //opening pair
                }
            }
            //Opening && characters
            else{
                S.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str2="(((a+b)+))";
        String str3="((a*n)+(a&b))";
        String str4="[({(a+b)*c})a-b]";
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str3));
        System.out.println(isDuplicate(str4));
    }
}
