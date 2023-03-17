package J12_LinkedList.LinkedListQ;

//to extends these classes we need to import these classes also
import J12_LinkedList.*;

//import J12_LinkedList.LinkedList;
//import J12_LinkedList.Node;

public class Q1{

    public static int getsize(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static Node removeNth(int n,Node head){//from start
        if(head==null){
            System.out.println("Linked List is Empty...!!");
            return head;
        }
        int size=getsize(head);
        if(n>=size || n<0){
            System.out.println("Index is Out of Bound");
            return head;
        }
        if(n==0){
            System.out.println(n+"th Node is: "+head.data);
            head=head.next;//this head is different Node variable; we need to return this then only head will delete;
            return head;
        }
        Node temp=head;
        int i=0;    //zero based indexing
        while(i<n-1){
            temp=temp.next;
            i++;
        }

//        if(idx==size){
//        System.out.println(idx+"th Node is: "+temp.next.data);
//            temp.next=null;
//            tail=temp;
//            return head;
//        }
        System.out.println(n+"th Node is: "+temp.next.data);
        temp.next=temp.next.next;
        return head;
    }

    public static Node removeNthFromEnd(int n,Node head){
        if(head==null){
            System.out.println("LL is Empty..!!");
            return null;
        }
        int size=getsize(head);
//        if(n==1){
//            //we have to take care for the tail;
//        }

        if(n==size){    //when element is head
            head=head.next;
            return head;
        }
        else if(n>size || n<1){
            System.out.println("N is out of bound");
            return head;
        }
        int count=1;
        Node temp=head;
        while(count< size-n ){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return head;
    }

    // search element using recursion and return index
    public static int search(Node head,int key){
        if(head==null){
            System.out.println("Element is not in LinkedList..!!");
            return -1;
        }
        if(head.data==key){
            return 0;//counting form 0 for zero indexing
        }
        int idx=search(head.next,key);
        if(idx==-1){
            return -1;
        }else{
            return idx+1;
        }
    }

    //reverse a linked list
    public static Node reverse(Node head){

//        Node curr=head;
//        Node pre=null;
//        Node nxt=curr.next;
//        while(curr!=null){
//            curr.next=pre;
//            pre=curr;
//            curr=nxt;
//            if(nxt==null){
//                return pre;
//            }
//            nxt=nxt.next;
//        }
        Node curr=head;
        Node pre=null;
        Node nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        return pre;
    }

//zero based indexing
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.head=removeNth(6,ll.head);
        ll.print();
        System.out.println(getsize(ll.head));

        System.out.println(search(ll.head,6));

        ll.head=reverse(ll.head);
        ll.print();
        ll.head=removeNthFromEnd(6,ll.head);//for end counting from 1
        ll.print();
        ll.head=reverse(ll.head);
        ll.print();
    }

}
