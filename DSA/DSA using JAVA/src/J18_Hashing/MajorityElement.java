package J18_Hashing;

import java.util.HashMap;

public class MajorityElement {
    // given an array of size n, find all the elements that appear more than n/3 times
    public static void main(String[] args){
        int arr[]={1,3,2,5,1,3,1,5,1};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

//        Set<Integer> set=map.keySet();
        for(Integer key: map.keySet()){
            if(map.get(key)> n/3){
                System.out.println(key);
            }
        }
    }
}
