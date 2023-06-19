package J10_LinkedList.LinkedListQ;

public class PalindromeLL {
    //    ------------------------------LinkedList Class------------------------------------
    // this class should be static because it cannot be directly referenced from a static context (i.e. main fun)
    static class LinkedList{
        Node head;
        public void add(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        public void print(){
            Node temp=head;//this head will point to the reference of that ll which called this fun
            while(temp!=null){
                System.out.print(temp.val+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    // also static because it cannot be directly referenced from a static context (i.e. class LinkedList)
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
//            this.next=null;
        }
    }

//    ------------------main method------------------
    public static void main(String[] args){

        LinkedList ll=new LinkedList();
        ll.add(2); ll.add(10); ll.add(5); ll.add(15); ll.add(20);
        ll.print();
//        System.out.println(ll.head.val);

        checkPalindrome(ll.head);

        LinkedList ll2=new LinkedList();
        ll2.add(5); ll2.add(15); ll2.add(5);
        ll2.print();
        checkPalindrome(ll2.head);
    }

    //check palindrome
    public static void checkPalindrome(Node head){
        if(head==null || head.next==null){
            System.out.println("Palindrome");
            return;
        }
        Node slow=head;//mid
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node curr=slow;
        Node pre=null;
        Node next;
        // reverse from mid
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        Node right=pre;
        Node left=head;
        while(right!=null){// because left has greater element i.e.last node is pointing to mid
            if(left.val!=right.val){
                System.out.println("Not Palindrome");
                return;
            }
            left=left.next;
            right=right.next;
        }
        System.out.println("Palindrome");;
    }

}
