package J09_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//Collections is a class but Collection is an interface
public class ArrayListBasic {

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(2,4);
        list.add(2,3);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.set(3,10);
        System.out.println( list );
        System.out.println( list.contains(10) );
        System.out.println( list.size() );
        System.out.println(list.get(2));

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        //for sorting in a list we can use all the sorting methods for array in arraylist
        //bubbleSort    insertionSort   selectionSort   mergeSort   Quicksort
        Collections.sort(list);
        System.out.println(list);

        multiDimentionalArrayList();
        swap(list,1,3);
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        if(idx1>=list.size() || idx2>=list.size()){
            System.out.println("Index is out of Bound...!!!");
            return;
        }
        int x=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,x);
    }

    public static void multiDimentionalArrayList(){
        ArrayList<Integer> arrlist1=new ArrayList<>();
        ArrayList<Integer> arrlist2=new ArrayList<>();
        for(int i=1;i<=10;i=i+2){
            arrlist1.add(i);
            arrlist2.add(i+1);
        }
        ArrayList< ArrayList<Integer> > mainlist=new ArrayList<>();
        mainlist.add(arrlist1);
        mainlist.add(arrlist2);
        System.out.println(mainlist);
        //print using loop
        System.out.println("Printing Using loop ");
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> curr=mainlist.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }

}
