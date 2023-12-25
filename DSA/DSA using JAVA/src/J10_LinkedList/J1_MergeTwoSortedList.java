package J10_LinkedList;

public class J1_MergeTwoSortedList {
    public static void main(String[] args){
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;

        while(list1!=null || list2!=null){
            int data1= list1!=null? list1.val:101;
            int data2= list2!=null? list2.val:101;
            if(data1<=data2 && list1!=null){
                temp.next=new ListNode(data1);
                list1=list1.next;
            }
            else if(data1>data2 && list2!=null){
                temp.next=new ListNode(data2);
                list2=list2.next;
            }
            temp=temp.next;

        }
        return ans.next;

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
