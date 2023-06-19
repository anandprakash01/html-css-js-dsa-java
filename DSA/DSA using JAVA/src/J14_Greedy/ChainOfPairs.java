package J14_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ChainOfPairs {
    // Max length chain of pair
    // you are given n pair of no,in every pair the 1st no. is always smaller than the second no.
    // a pair(c,d) can come after (a,b) if(b<c)
    public static void main(String[] args){                 //O(nlogn)
        int[][] arr ={{5,2},{39,60},{58,28},{27,40},{50,90}};        //5*2
        //for Sorting based on 2nd no
        int[][] pair =new int[arr.length][3];
        //we can simply skip this if we just want to length and don't want to know the pair.
        for(int i=0;i<pair.length;i++){
            //pair.length for totalNo of rows and pair[0].length for colum
            pair[i][0]=i;
            pair[i][1]=arr[i][0];
            pair[i][2]=arr[i][1];
        }
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> index=new ArrayList<>();
        index.add(pair[0][0]);//first pair
        int pairEnd=pair[0][2];
        int chainlen=1;
        for(int i=1;i<pair.length;i++){
            if(pair[i][1]>pairEnd){
                chainlen++;
                pairEnd=pair[i][2];
                index.add(pair[i][0]);
            }
        }
        System.out.println("Max length: "+chainlen);
//        for(int i=0;i<index.size();i++) {
//            System.out.print("pair" + index.get(i) + "  ");
//        }

        for (Integer integer : index) {
            System.out.print("pair" + integer + "  ");
        }

    }
}
