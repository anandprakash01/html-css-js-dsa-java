package J11_ArrayList;

import java.util.ArrayList;

public class PairSum {
    // Find if any pair in Sorted ArrayList has target sum
    public  static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target=5;
        int l=0;
        int r=list.size()-1;
        while(l<r){
            int sum=list.get(l)+list.get(r);
            if(sum==target){
                System.out.println(l +" "+ r +" : has target Sum");
                return ;
            }
            if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        System.out.println("Sum does not found");

    }
}
