package J10_LinkedList.LinkedListQ;

import J10_LinkedList.CreateLinkedList.LinkedList;
import J10_LinkedList.CreateLinkedList.Node;

public class MergeSort {

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addLast(9);
        list.addLast(5);
        list.addLast(7);
        list.addLast(4);
        list.addLast(4);
        list.addLast(2);
        list.addLast(10);
        list.print();
        list.head=mergeSort(list.head);
        list.print();

    }
    public static Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;// (fast=head.next) it will give last node of first half as mid
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //slow is last node of first half as mid
        return slow;
    }

    public static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);
        Node righthead=mid.next;
        mid.next=null; // separating in two halves list
        Node lefthalf=mergeSort(head);
        Node righthalf=mergeSort(righthead);

        Node mergedHead=merge(lefthalf,righthalf);

        return mergedHead;
    }
    public static Node merge(Node head1,Node head2){
        Node head=new Node(-1);
        Node temp=head;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            temp=head1;
            head1=head1.next;
        }
        while(head2!=null){
            temp.next=head2;
            temp=head2;
            head2=head2.next;
        }
        return head.next;
    }


}
