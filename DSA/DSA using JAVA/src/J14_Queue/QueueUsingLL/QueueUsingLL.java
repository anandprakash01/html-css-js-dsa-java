package J14_Queue.QueueUsingLL;

class Queue{
    class Node{     //neasted class
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    private Node head;
    private Node tail;

    boolean isEmpty(){
        return head==null && tail==null;
    }

    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
        }
        return count;
    }

    void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    int remove(){
        if(head==null){
            System.out.println("Error..!! Queue is empty. can not remove");
            return -1;
        }
        int val=head.data;

        if(head.next==null){
            head=tail=null;
        }else{
            head=head.next;
        }

        return val;
    }

    int peek(){
        if(head==null){
            System.out.println("Error!!!...can not peek Queue is Empty");
            return -1;
        }
        return head.data;
    }
}
public class QueueUsingLL {
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
