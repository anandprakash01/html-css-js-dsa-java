package J18_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class J6_ArrayListQ5 {
    /* A number x is lonely when it appears only once, and
    no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
    Return all lonely numbers in nums. You may return the answer in any order.
    */

    public static List<Integer> findLonely(int[] nums) {
        List<Integer> lonely = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        // 1. Build HashSet for efficient lookups
        for (int num : nums) {
            seen.add(num);
        }

        // 2. Check for lonely numbers
        for (int num : nums) {
            if (!seen.contains(num - 1) && !seen.contains(num + 1)) {
                lonely.add(num);
            }
        }
        return lonely;
    }

    public static void main(String[] args){
        int[] nums={8,2,6,5,10};

        System.out.println(findLonely(nums));
    }
}
