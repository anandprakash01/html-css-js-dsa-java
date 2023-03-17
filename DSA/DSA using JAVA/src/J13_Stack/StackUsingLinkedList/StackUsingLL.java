package J13_Stack.StackUsingLinkedList;

class Stack{
    class Node{
        public int data;
        Node next;
        Node(int data){
            this.data=data;
            //this.next=null;
        }
    }

    Node head;
    boolean isEmpty(){
        return head==null;
    }

    void print(){
        if(head==null){
            System.out.println("Error..!! Stack is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void push(int data){    //O(1)
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    int pop(){      // O(1)
        if(isEmpty()){
            System.out.println("Error...Stack is Empty.Can not pop");
            return -1;
        }
        int val=head.data;
        head=head.next;
        return val;
    }

    int peek(){     // O(1)
        if(isEmpty()){
            System.out.println("Error...Stack is Empty.Can not pop");
            return -1;
        }
        return head.data;
    }
}
public class StackUsingLL {

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
