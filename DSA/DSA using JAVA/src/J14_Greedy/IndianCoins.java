package J14_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IndianCoins {
    public static void main(String[] args){
        // Indian coins
        //we have given an infinite no of denominations(notes/note),find the min no of coins/notes to make change for a value V.
        Integer[] notes ={1,2,5,10,20,50,100,500,2000};
        int money=529;
        //sort in descending order,,, for reverse order we use collections and for that it must be Integer type
        Arrays.sort(notes, Collections.reverseOrder());
        int noOfCoins=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<notes.length;i++){
//            if(money>=notes[i]){
                while(money>=notes[i]){
                    money=money-notes[i];
                    noOfCoins++;
                    ans.add(notes[i]);
                }
//            }
        }
        System.out.println(noOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
