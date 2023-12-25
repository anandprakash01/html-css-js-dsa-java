package J17_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBasic {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s){
//            return this.rank-s.rank;  // according to rank
            return s.rank- this.rank;   // according to rank in reverse order
        }
    }

    public static void main(String[] args){
//        PriorityQueue<Integer> pq=new PriorityQueue<>();  //by default order will be ascending
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);// O(log n)
        pq.add(8);
        pq.add(1);
        pq.add(9);
        pq.add(10);

        System.out.println(pq);

        // Highest priority element will be on front other ele can be in any order
        
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove(); // O(lon n)
        }

        PriorityQueue<Student> pqStudent=new PriorityQueue<>();

        pqStudent.add(new Student("anand",1));
        pqStudent.add(new Student("hr",2));
        pqStudent.add(new Student("praveen",3));

        while(!pqStudent.isEmpty()){
            System.out.println(pqStudent.peek().name+" ---> "+pqStudent.peek().rank);
            pqStudent.remove();
        }

    }
}
