package J13_Stack;

import java.util.Stack;

public class Q6_ValidParenthesis {

    // only for '(' and ')'
    // only for same type of brackets
    public static void isParenthesisBalanced(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                break;
            }
        }
        if(count==0){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }

    //valid parenthesis
    public static void isBalanced(String str){
        boolean check=true;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char bracket=str.charAt(i);
            if(bracket=='(' || bracket=='{' || bracket=='['){
                s.push(bracket);
            }
            else{
                if(s.isEmpty()){
                    check=false;
                    break;
                }
                char topbracket=s.peek();
//                if((topbracket=='(' && bracket==')') || (topbracket=='{' && bracket=='}') || (topbracket=='[' && bracket==']')){
//                    s.pop();
//                }
//                else{
//                    check= false;
//                    break;
//                }
                switch(bracket){
                    case ')' : if(topbracket=='('){
                                    s.pop();
                                }else{
                                    check=false;
                                    break;
                                }
                        break;
                    case '}' : if(topbracket=='{'){
                                    s.pop();
                                }else{
                                    check=false;
                                    break;
                                }
                        break;
                    case ']' : if(topbracket=='['){
                                    s.pop();
                                }else{
                                    check=false;
                                    break;
                                }
                        break;
                }
            }
        }

        if(check && s.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }

    public static void main(String[] args){
        String str="()(())(())";
        isParenthesisBalanced(str);
        String str2="({}}}{{";
        isBalanced(str2);
    }
}
