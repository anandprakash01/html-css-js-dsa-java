package J10_LinkedList.LinkedListQ;

//to extends these classes we need to import these classes also
import J10_LinkedList.LinkedList;
import J10_LinkedList.Node;

public class ReverseLL {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.head=reverse(ll.head);
        ll.print();
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
}
