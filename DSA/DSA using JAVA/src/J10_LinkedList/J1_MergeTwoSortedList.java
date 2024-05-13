package J10_LinkedList;


import J10_LinkedList.CreateLinkedList.LinkedList;
import J10_LinkedList.CreateLinkedList.Node;

public class J1_MergeTwoSortedList {
    public static void main(String[] args){
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        if(list1==null){
            list2.print();
            return;
        }
        if(list2==null){
            list1.print();
            return;
        }
        Node head1=list1.head;
        Node head2=list2.head;

        LinkedList ans=new LinkedList();
        ans.addLast(-1);
        Node temp=ans.head;

        while(head1!=null || head2!=null){
            int val1= head1!=null? head1.data:101;//101 beacause the value is between 0-100
            int val2= head2!=null? head2.data:101;
            if(val1<=val2 && head1!=null){
                temp.next=new Node(val1);
                head1=head1.next;
            }
            else if(val1>val2 && head2!=null){
                temp.next=new Node(val2);
                head2=head2.next;
            }
            temp=temp.next;

        }
        ans.print();
        return;

        // while(list1!=null && list2!=null){
        //     if(list1.val<list2.val){
        //         temp.next=new ListNode(list1.val);
        //         list1=list1.next;
        //     }
        //     else{
        //         temp.next=new ListNode(list2.val);
        //         list2=list2.next;
        //     }
        //     temp=temp.next;
        // }
        // while(list1!=null){
        //     temp.next=new ListNode(list1.val);
        //     temp=temp.next;
        //     list1=list1.next;
        // }
        // while(list2!=null){
        //     temp.next=new ListNode(list2.val);
        //     temp=temp.next;
        //     list2=list2.next;
        // }
        // return ans.next;
    }
}
