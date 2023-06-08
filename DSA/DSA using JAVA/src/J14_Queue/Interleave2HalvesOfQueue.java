package J14_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave2HalvesOfQueue {
    // interleave(add between) two halves of queue --> 1 2 3 4 5 6 7 8 9 10 -->> 1 6 2 7 3 8 4 9 5 10 (Even Size)

    public static void interleave(Queue<Integer> q){
        Queue<Integer> firsthalf=new LinkedList<>();
        int size= q.size();
        for(int i=1;i<=size/2;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] str) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 2; i < 20; i += 2) {
            q.add(i);
        }
        System.out.println(q);
        interleave(q);
        System.out.println(q);

//        while (!q.isEmpty()) {
//            System.out.print(q.peek() + " ");
//            q.remove();
//        }
    }
}
