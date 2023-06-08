package J14_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        q.remove();
        q.remove();
        System.out.println(q);  // Direct Print
        System.out.println(q.isEmpty());
        System.out.println(q.size());

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
