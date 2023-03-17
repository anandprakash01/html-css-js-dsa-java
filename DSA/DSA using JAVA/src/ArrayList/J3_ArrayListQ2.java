package ArrayList;

import java.util.ArrayList;

public class J3_ArrayListQ2 {
    //find any pair in ArrayList that has target sum
    public static void main(String[] args){
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(5);
        arrlist.add(7);
        arrlist.add(9);
        arrlist.add(11);
        arrlist.add(12);
        //it is sorted ArrayList so we can use 2 pointer
        int target=10;
        int i=0;
        int j=arrlist.size()-1;
        boolean check=false;
        while(i<j){
            int sum=arrlist.get(i)+arrlist.get(j);
            if(sum==target){
                check=true;
                break;
            }
            if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        if(!check){
            System.out.println("Not found");
        }else{
            System.out.println("the indexes that has target sum are: "+ i+" and "+j);
        }
    }
}
