package J12_LinkedList.LinkedListQ;

import java.util.LinkedList;

public class UsingJCF {

    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addLast(11);
        list.add(20);
        list.addFirst(5);
        System.out.println(list);

        list.add(2,7); //zero based indexing
        System.out.println(list);
//        System.out.println(list.remove());//removes from start
//        System.out.println(list);
//        System.out.println(list.removeFirst());
//        System.out.println(list);
//        System.out.println(list.removeLast());
//        System.out.println(list);
        System.out.println(list.remove(3)); //removes at index
        System.out.println(list);
        System.out.println(list.get(2));//gives the element at index
    }

}
