package J17_Heap;

import java.util.ArrayList;

public class HeapUsingArrayList {

    static class Heap{
        // or we can use priorityQueue same like this
        ArrayList<Integer> list=new ArrayList<>();

        public void add(int data){
            list.add(data);
            int child=list.size()-1;    // child index
            int parent=(child-1)/2;     // parent index

            // fix heap (min heap)
            while(parent>=0 && list.get(child) < list.get(parent)){// O(log n)
                //swap
                int temp=list.get(child);
                list.set(child,list.get(parent));
                list.set(parent,temp);

                child=parent;
                parent=(child-1)/2;
            }
        }

        public int peek(){
            return list.get(0);
        }
        public boolean isEmpty(){
            return list.size()==0;
        }

        public void print(){
            System.out.println(list);
        }

        public int remove(){
            //step 1 : swap first and last
            int data=list.get(0);
            list.set(0 , list.get(list.size()-1));
            list.set(list.size()-1 , data);

            //step 2: remove last
            list.remove(list.size()-1);

            //step 3: heapify
            heapify(0);

            return data;

        }
        private void heapify(int i){// i is root index   O(log n)
            int left=2*i +1;
            int right=2*i +2;
            int minIdx=i;

            if(left<list.size() && list.get(minIdx) > list.get(left)){
                minIdx=left;
            }
            if(right<list.size() && list.get(minIdx)>list.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){
                int temp=list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);

                heapify(minIdx);//to fix node which has changed
            }

        }

    }
    public static void main(String[] args){
        Heap h=new Heap();
        h.add(2);
        h.add(3);
        h.add(1);
        h.add(5);

        h.print();


    }
}
