package J10_LinkedList.LoopLL;

public class DetectLoop {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args){
        Node head=new Node(1);
        Node looppoint=new Node(2);
        head.next=looppoint;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=looppoint; // connecting loop/cycle

        Node temp=head;

//        while(temp!=null){
//            System.out.print(temp.data);
//            temp=temp.next;
//        }

        System.out.println(isCycle(head));
        removeCycle(head);
        System.out.println(isCycle(head));

    }

    // isCycle
    public static boolean isCycle(Node head){
        if(head==null){return false;}
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
    }

    //remove Cycle/loop
    public static void removeCycle(Node head){
//        if(!isCycle(head)){
//            System.out.println("Error!!! Cycle does not exist...");
//            return;
//        }
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(!cycle){
            System.out.println("Error!!! Cycle does not exist...");
            return;
        }
        slow=head;
        Node pre=null;
        // cornerCase
        // if(slow==fast)// linked-list is forming a full loop starting from head (Circular LL)

        while(slow!=fast){
            slow=slow.next;
            pre=fast;
            fast=fast.next;
        }
        pre.next=null;
    }

}
