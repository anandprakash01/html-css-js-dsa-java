package J10_LinkedList.LinkedListQ;


import J10_LinkedList.CreateLinkedList.LinkedList;
import J10_LinkedList.CreateLinkedList.Node;

public class ZigzagLL {
    // first node then last, then second and second last------------
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addLast(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.print();
        list.addMiddle(4,5);
//        list.addLast(6);
        list.print();
        zigzag(list.head);
        list.print();
    }

    //for ziz-zag ll
    public static void zigzag(Node head){
        Node slow=head;
        Node fast=head.next;//to find mid as last node of 1st half
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //reverse from mid
        Node curr=slow.next;
        slow.next=null;//dividing in 2 halves
        Node pre=null;
        Node nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        //for alternate merge
        //4 variables
        Node right=pre;
        Node left=head;
        Node nextR;
        Node nextL;
        while(left!=null && right!=null){
            //zigzag
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            //update
            left=nextL;
            right=nextR;
        }
    }
}
