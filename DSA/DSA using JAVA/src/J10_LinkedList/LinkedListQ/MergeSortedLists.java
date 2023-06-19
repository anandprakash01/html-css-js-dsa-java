 package J10_LinkedList.LinkedListQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*
    You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
    Merge all the linked-lists into one sorted linked-list and return it.
*/

public class MergeSortedLists {
    // to create linked list
    public static <E> LinkedList<E> createLinkedList(E... elements) {
        LinkedList<E> newlist = new LinkedList<>();
        for (E ele : elements) {
            newlist.add(ele);
        }
        return newlist;
    }

    // main method
    public static void main(String[] args) {
        LinkedList<Integer> list1 = createLinkedList(1, 4, 5);
        LinkedList<Integer> list2 = createLinkedList(1, 3, 4);
        LinkedList<Integer> list3 = createLinkedList(2, 6);

        LinkedList lists[] = { list1, list2, list3 };
        System.out.print("Array of LinkedList is :");
        for (LinkedList i : lists) {
            System.out.print(i);
        }
        System.out.println();

        addlinkedList(lists);

    }

    public static void addlinkedList(LinkedList list[]) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (LinkedList ll : list) {
            for (Object o : ll) {
                arrlist.add((Integer) o);
            }
            // for (int j = 0; j < ll.size(); j++) {
            // arrlist.add((Integer) ll.get(j));
            // }
        }
        System.out.println("Merged ArrayList Elements: " + arrlist);
        Collections.sort(arrlist);
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < arrlist.size(); i++) {
            ll.add(arrlist.get(i));
        }
        System.out.println("Merged sorted linked list: " + ll);

        // Another way
//         for(int i=1;i<list.length;i++){
//            list[0]=mergeTwoLists(list[0],list[i]);
//         }
//
//         int cnt = 1;
//         while(cnt<arr.length){
//             for (int i = 0; i + cnt< arr.length; i=i+cnt*2) {
//                 arr[i]=mergeTwoLists(arr[i],arr[i+cnt]);
//            }
//            cnt*=2;
//         }
//         return lists[0];
    }

//     public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
//         Node head = new Node(0);
//         ListNode ans=head;
//         while (l1 != null && l2 != null) {
//             if (l1.val < l2.val) {
//                 head.next = l1;
//                 head = head.next;
//                 l1 = l1.next;
//             } else {
//                 head.next = l2;
//                 head = head.next;
//                 l2 = l2.next;
//             }
//         }
//         if(l1==null){
//             head.next=l2;
//         }
//         if(l2==null){
//             head.next=l1;
//         }
//         return ans.next;
//     }

}
