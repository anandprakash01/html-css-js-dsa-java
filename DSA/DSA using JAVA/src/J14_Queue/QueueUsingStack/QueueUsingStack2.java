package J14_Queue.QueueUsingStack;

import java.util.Stack;

public class QueueUsingStack2 {
    //implementing add in O(1) and remove in O(n)
    static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int data){     //O(1)
            s1.add(data);
        }

        int remove(){       //O(n)
            if(s1.isEmpty()){
                System.out.println("Queue is Empty..can not remove");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
            int front=s2.pop();
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
            return front;
        }

        int peek(){       //O(n)
            if(s1.isEmpty()){
                System.out.println("Queue is Empty..can not remove");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
            int front=s2.peek();
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
            return front;
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
