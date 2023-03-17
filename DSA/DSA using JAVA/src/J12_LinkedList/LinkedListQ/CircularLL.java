package J12_LinkedList.LinkedListQ;

public class CircularLL{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    Node last;
    void print(){
        if(head==null){
            System.out.println("Circular Linked List is Empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }while(temp!=head);

        System.out.println();
    }

    void insertAtBeginning(int data){

//        Node newnode=new Node(data);
//        if(head== null){
//            head=last=newnode;
//            newnode.next=head;
//            return;
//        }
//        Node temp=head;
//        do {
//            temp=temp.next; //if there is only 1 Node then if will come back to head;
//        }while(temp.next!=head);
//
//        temp.next=newnode;
//        newnode.next=head;
//        head=newnode;

        //if we use last as our reference node then we don't have to travel
        //using last
        Node newnode=new Node(data);
        if(last== null){
            head=newnode;
            last=newnode;
            newnode.next=head;
            return;
        }
        newnode.next=last.next;
        last.next=newnode;
        head=newnode;
    }

    void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=last=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        last=newNode;

        //using last;

//        if(last==null){
//            head=last=newNode;
//            newNode.next=last;
//            return;
//        }
//        newNode.next=last.next;
//        last.next=newNode;
//        last=newNode;
    }

    void insertAfter(int data,int item){
        Node newnode=new Node(data);
        if(last==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=last.next;
        do{
            if(temp.data==item){
                newnode.next=temp.next;
                temp.next=newnode;
                if(temp==last){
                    last=newnode;
                }
                return;
            }
            temp=temp.next;
        }while(temp!=last.next);

        System.out.println(item+" -> The given node is not present in the list");
    }

    int deleteFirst(){
        if(head==null){
            System.out.println("Error... list is Empty...!!");
            return -1;
        }
        int val=head.data;
        if(head.next==head){
            head=last=null;
            return val;
        }
//        Node temp=head;
//        while(temp.next!=head){
//            temp=temp.next;
//        }
//        temp.next=head.next;
//        head=temp.next;

        //using Last
        last.next=last.next.next;
        head=last.next;
        return val;
    }

    int deleteLast(){
        if(head==null){
            System.out.println("Error... list is Empty...!!");
            return -1;
        }
        int val;
        if(head.next==head){
            val=head.data;
            head=last=null;
            return val;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        val=temp.next.data;
        temp.next=head;
        last=temp;

        //using last Node
//        Node temp=last;
//        while(temp.next!=last){
//            temp=temp.next;
//        }
//        val=last.data;
//        temp.next=last.next;
//        last=temp;

        return val;
    }



    public static void main(String[] args){
        CircularLL list=new CircularLL();
        list.head=new Node(2);
        list.last=list.head;//also setting Node last
        list.head.next=list.head;

        list.print();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.print();
        list.insertAtLast(40);
        list.insertAtLast(50);
        list.print();
        list.insertAfter(60,50);
        list.print();
        System.out.println(list.deleteFirst());
        list.print();
        System.out.println(list.deleteFirst());
        list.print();
        System.out.println(list.deleteLast());
        list.print();
        System.out.println(list.deleteLast());
        list.print();

    }
}
