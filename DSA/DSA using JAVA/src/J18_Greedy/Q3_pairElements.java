package J18_Greedy;

import java.util.Arrays;

public class Q3_pairElements {
    // Given 2 arrays A and B of same length,pair each element of A to get an element in B,
    // such that Sum of absolute differences of all pairs is min.
    // |1-2|+|4-3|+|7-5|+|8-6|=6
    public static void main(String[] args){
        int[] a={4,1,8,7};
        int[] b={2,3,6,5};
        /*we will get min difference only when we select min value from 1st array and min value
         from 2nd array for a pair coz the difference will be min if we minus min value to min value and minus max
         value to max value*/
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.abs(a[i]-b[i]);
        }
        System.out.println(sum);
    }
}
