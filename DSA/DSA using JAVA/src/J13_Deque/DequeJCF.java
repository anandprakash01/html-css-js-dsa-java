package J13_Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeJCF {
    public static void main(String[] args){
        Deque<Integer> d=new LinkedList<>();
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        d.addFirst(8);
        d.addFirst(10);
        d.addLast(11);
        d.add(9);//it will add at last

        System.out.println(d);
        System.out.println(d.remove());//it will remove from start
        System.out.println(d.removeLast());
        System.out.println(d.removeFirst());
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        System.out.println(d);
    }
}
