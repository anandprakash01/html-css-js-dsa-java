package J11_Stack;

import java.util.Stack;

public class Q1_reverseStack {

    public static void pushAtBottom(Stack<Integer> s,int data){ // Using recursion
//        if we use new stack it will take extra memory that's why using recursion
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    //reverse a stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        while(!st.isEmpty()){
//            System.out.println(st.peek());
//            st.pop();
//        }
        reverseStack(st);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
