package J09_ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args){
        // Find if any pair in Sorted and rotated ArrayList has target sum
            ArrayList<Integer> list=new ArrayList<>();
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            int target=16;
            int l=0;
            int r=0;
            int n=list.size();
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    r=i;
                    l=i+1;
                    break;
                }
            }
            while (l!=r){
                int sum=list.get(l)+list.get(r);
                if(sum==target){
                    System.out.println("Pair sum is Equal to target:" + l +" "+ r);
                    return;
                }
                if(sum<target){
                    l=(l+1) % n;
                }
                else{
                    r= (n + r-1) % n;
                }
            }
            System.out.println("Not found");
    }
}
