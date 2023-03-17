package J12_LinkedList.LinkedListQ;

import J12_LinkedList.LinkedList;
import J12_LinkedList.Node;


public class CycleInLL {
    //detect cycle/loop in LinkedList and remove it
    public static boolean isCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(Node head){
        if(!isCycle(head)){
            return;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        slow=head;
        Node pre=null;
        while(slow!=fast){
            pre=fast;
            fast=fast.next;
            slow=slow.next;
        }
        pre.next=null;
    }

    public static void circle(Node head){

    }

    public static void main(String[] args){

        LinkedList list=new LinkedList();
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
        list.addLast(8);
        list.addLast(10);
        list.print();

        list.tail.next=list.head.next;
        System.out.println(isCycle(list.head));
        removeCycle(list.head);
        System.out.println(isCycle(list.head));
        list.print();

    }

}
