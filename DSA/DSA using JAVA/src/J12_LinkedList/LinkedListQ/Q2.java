package J12_LinkedList.LinkedListQ;

import J12_LinkedList.LinkedList;
import J12_LinkedList.Node;


public class Q2 {

    public static boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse from mid
        Node curr=slow;
        Node pre=null;
        Node nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        Node right=pre;
        Node left=head;
        while(right!=null){//because left has greater element i.e.last node is pointing to mid
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String [] args){
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(5);
        //ll.addLast(7);
        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(1);
        ll.print();
        System.out.println(isPalindrome(ll.head));
        ll.print();


    }
}
