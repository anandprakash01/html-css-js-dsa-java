package J11_Stack;

import java.util.Stack;

public class S4_StackUsingJCF {

    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        Stack s1=new Stack<>();//its object type
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);

        System.out.println(s.pop());

//        while(!s.isEmpty()){
//            System.out.print(s.peek()+" ");
//            s.pop();
//        }
        System.out.println(s);
        s1.push(s.pop());
        s1.push(s.pop());
        s1.push(s.pop());
        s1.push(s.pop());
        //s1.push(s.pop());
        System.out.println(s.isEmpty());

        while(!s1.isEmpty()){
            System.out.print(s1.peek()+" ");
            s1.pop();
        }
    }
}
