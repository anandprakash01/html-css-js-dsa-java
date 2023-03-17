package J13_Stack;

import java.util.Stack;

            //Make The String Great
    //remove both character if s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice- versa.
public class Q2_MakeTheStringGreat {
    public static void main(String[] args){
        String str="LeEeetCode";//remove e and E
        Stack<Character> myStack=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(!myStack.isEmpty() && Math.abs(myStack.peek()-str.charAt(i))==32 ) {
                myStack.pop();
            }
            else{
                myStack.push(str.charAt(i));
            }
        }



//        for(int i=0;i<str.length();i++){
//            char x=str.charAt(i);
//            if(myStack.isEmpty()){
//                myStack.push(x);
//            }
//            else{
//                char y=myStack.peek();
//                if(Character.toUpperCase(x)==Character.toUpperCase(y) && (
//                        Character.isUpperCase(x) && Character.isLowerCase(y) ||
//                                Character.isLowerCase(x) && Character.isUpperCase(y) ) )
//                {
//                    myStack.pop();
//                }
//                else{
//                    myStack.push(x);
//                }
//            }
//        }
//        for(char ch:myStack){
//            System.out.print(ch);
//        }

        int m = myStack.size();//this will take less time for print
        char res[] = new char[m];
        for(int i=m-1; i>=0; i--){
            res[i] = myStack.pop();
        }

        System.out.println(res);
    }
}
