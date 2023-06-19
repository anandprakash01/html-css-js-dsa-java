package J10_LinkedList.DoublyLL;


class DLL{
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;//tail is more useful here
    public int size;

    void print(){
        if(isEmpty()){
            System.out.println("Doubly LinkedList is Empty..can not print...!!!");
            return ;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    boolean isEmpty(){
        return head==null;
    }

    void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
//        Node temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=newnode;
//        newnode.prev=temp;
//        tail=newnode;
    }

    int removeFirst(){
        if(head==null){
            System.out.println("Doubly LinkedList is Empty...can not removeFirst");
            return -1;
        }
        int val=head.data;
        size--;
        if(head.next==null){
            head=tail=null;
            return val;
        }
        head=head.next;
        head.prev=null;//if there is single node this line will give error
        return val;
    }

    int removeLast(){
        if(isEmpty()){
            System.out.println("Doubly Linked List is Empty...can not removeLast");
            return -1;
        }
        size--;
        int val;
        if(head.next==null){
            val=head.data;
            head=tail=null;
            return val;
        }
        val=tail.data;
        tail=tail.prev;
        tail.next=null;
//        Node temp=head;
//        while(temp.next.next!=null){
//            temp=temp.next;
//        }
//        val=temp.next.data;
//        temp.next.prev=null;
//        temp.next=null;
//        tail=temp;
        return val;
    }

    void reverseDLL(){
        if(head==null || head.next==null){
            return;
        }
        Node curr=head;
        Node pre=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            curr.prev=next;// one extra step
            pre=curr;
            curr=next;
        }
        head=pre;
    }
}
public class DoublyLL {
    public static void main(String[] args){

        DLL dll=new DLL();
        System.out.println(dll.isEmpty());
        dll.addFirst(4);
        System.out.println(dll.isEmpty());
        dll.addFirst(5);
        dll.addFirst(6);
        dll.addFirst(7);
        dll.addLast(2);
        dll.addLast(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.reverseDLL();
        dll.print();

    }
}
