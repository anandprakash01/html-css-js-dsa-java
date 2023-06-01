package J12_LinkedList.LinkedListQ;

//to extends these classes we need to import these classes also
import J12_LinkedList.LinkedList;
import J12_LinkedList.Node;

public class DeleteNode {

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(10);
        ll.print();
        ll.head=removeNth(6,ll.head);
        ll.print();
        System.out.println(getSize(ll.head));
        ll.print();
        ll.head=removeNthFromEnd(6,ll.head);//for end counting from 1
        ll.print();
    }


    public static int getSize(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static Node removeNth(int n,Node head){// from start
        if(head==null){
            System.out.println("Linked List is Empty...!!");
            return head;
        }
        int size=getSize(head);
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
        System.out.println(n+"th Node is: "+temp.next.data);
        temp.next=temp.next.next;
        return head;
    }

    public static Node removeNthFromEnd(int n,Node head){
        if(head==null){
            System.out.println("LL is Empty..!!");
            return null;
        }
        int size=getSize(head);
//        if(n==1){
//            //we have to take care for the tail;
//        }

        if(n==size){    //when element is head
            head=head.next;
            return head;
        }
        if(n>size || n<1){
            System.out.println("N is out of bound");
            return head;
        }
        int count=0;
        Node temp=head;
        while(count< (size-n)-1 ){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
