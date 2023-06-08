package J14_Queue.QueueUsingStack;

import java.util.Stack;

public class QueueUsingStack1 {
        //implementing add in O(n) and peek/remove in O(1)
    static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int data){     //O(n)
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
            s1.add(data);
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
        }

        int remove(){       //O(1)
            if(s1.isEmpty()){
                System.out.println("Queue is Empty..can not remove");
                return -1;
            }
            return s1.pop();
        }

        int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty..can not remove");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.remove();
        q.remove();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.remove();

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }


}
