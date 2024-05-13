package J10_LinkedList.LinkedListQ;

import J10_LinkedList.CreateLinkedList.LinkedList;
import J10_LinkedList.CreateLinkedList.Node;

public class SearchLLRecursion {
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

        System.out.println(searchRecursion(ll.head,6));
    }

    // search element using recursion and return index
    public static int searchRecursion(Node head, int key){
        if(head==null){
            System.out.println("Element is not in LinkedList..!!");
            return -1;
        }
        if(head.data==key){
            return 0;//counting form 0 for zero indexing
        }
        int idx=searchRecursion(head.next,key);
        if(idx==-1){
            return -1;
        }else{
            return idx+1;
        }
    }
}
