package J10_LinkedList;

//LinkedList and Node classes are in same package as this class
public class ApplyLL {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addFirst(3);
        ll.addFirst(12);
        ll.addLast(9);
        ll.addLast(8);
        ll.addMiddle(4,2);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.getSize());
        //ll.print();
        ll.removeLast();
        ll.print();
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.getSize());

        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.getSize());

    }
}
