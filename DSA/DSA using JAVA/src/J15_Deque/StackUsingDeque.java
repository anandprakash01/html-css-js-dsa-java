package J15_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public static class Stack{
        static Deque<Integer> d=new LinkedList<>();
        public static boolean isEmpty(){
            return d.isEmpty();
        }
        public static void push(int data){
            d.add(data);//or d.addLast(); both are same
        }
        public static int pop(){
            if(d.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return d.removeLast();
        }
        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return d.getLast();
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
