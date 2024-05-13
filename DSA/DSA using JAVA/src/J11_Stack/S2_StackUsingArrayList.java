package J11_Stack;

import java.util.ArrayList;

public class S2_StackUsingArrayList {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();

        boolean isEmpty(){
            return list.isEmpty();
        }

        void push(int data){
            list.add(data);
        }

        int pop(){  // O(1)
            if(isEmpty()){
                System.out.println("Error...Stack is Empty..!!");
                return -1;
            }
            //int val=list.get(list.size()-1)
            return list.remove(list.size()-1);
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Error...Stack is Empty..!!");
                return -1;
            }
            return list.get(list.size()-1);
        }

        void print(){
            if(isEmpty()){
                System.out.println("Error...Stack is Empty..!!");
                return;
            }
            for(int i=list.size()-1 ;i>=0;i--){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
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
        s.print();
        System.out.println(s.pop());
        s.print();
        s1.push(s.pop());
        s1.push(s.pop());
        s1.push(s.pop());
        s1.push(s.pop());
        //s1.push(s.pop());
        System.out.println(s.isEmpty());
        s1.print();

    }
}
