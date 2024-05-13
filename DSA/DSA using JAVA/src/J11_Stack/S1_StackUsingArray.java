package J11_Stack;

class Stack{
    int arr[];
    int size;
    int top;
    Stack(int size){
        arr=new int[size];
        this.size=size;
        top=-1;
    }

    boolean isEmpty(){
        return top==-1;
    }

    public void print(){
        if(top==-1){
            System.out.println("Error...Stack is empty. can not print");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void push(int data){    //O(1)
        if(top+1>=size){
            System.out.println("Error...Stack is full. can not push element");
            return;
        }
        top++;
        arr[top]=data;
    }

    int pop(){  // O(1)
        if(top==-1){
            System.out.println("Error...Stack is empty. can not pop element");
            return -1;
        }
        int val=arr[top];
        top--;
        return val;
    }

    int peek(){ // O(1)
        if(top==-1){
            System.out.println("Error...Stack is empty. can not peek element");
            return -1;
        }
        return arr[top];
    }

}

public class S1_StackUsingArray {
    public static void main(String[] args){
        Stack s=new Stack(5);
        Stack s1=new Stack(5);
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
