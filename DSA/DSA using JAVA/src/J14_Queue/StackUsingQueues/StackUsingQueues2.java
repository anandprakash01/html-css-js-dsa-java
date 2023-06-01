package J14_Queue.StackUsingQueues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues2 {
            //implementing push in O(1) and pop in O(n)
    static class Stack{

        Queue<Integer> q1=new ArrayDeque<>();
        Queue<Integer> q2=new LinkedList<>();

        boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int front=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    front=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(front);
                }
            }
            else{
                while(!q2.isEmpty()){
                    front=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(front);
                }
            }
            return front;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int front=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    front=q1.remove();
                    q2.add(front);
                }
            }
            else{
                while(!q2.isEmpty()){
                    front=q2.remove();
                    q1.add(front);
                }
            }
            return front;
        }
    }

    public static void main(String[] args){
        Stack s=new Stack();
        Stack s1=new Stack();
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);
//        while(!s.isEmpty()){
//            System.out.print(s.peek()+" ");
//            s.pop();
//        }
//        System.out.println();
        System.out.println(s.pop());

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
        System.out.println();

    }
}
