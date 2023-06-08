package J15_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    public static class Queue{
        static Deque<Integer> d=new LinkedList<>();

        boolean isEmpty(){
            return d.isEmpty();
        }
        void add(int data){
            d.add(data);//d.addLast()
        }
        int remove(){
            if(d.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front= d.remove(); //d.removeFirst();
            return front;
        }
        int peek(){
            if(d.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return d.getFirst();
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(4);
        q.add(6);
        q.add(9);
        q.add(0);
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
