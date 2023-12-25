package J18_Hashing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class RomanToInteger {
    // Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    // Input: s = "LVIII"
    // Output: 58
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String romanNum=sc.nextLine();
        int ans=0;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<romanNum.length();i++){
            int val=map.get(romanNum.charAt(i));
            if(i<romanNum.length()-1 && val<map.get(romanNum.charAt(i+1))){
                val=map.get(romanNum.charAt(i+1))-val;
                i++;
            }
            ans+=val;
        }
        System.out.println(ans);

//        Solution Without HashMap
//         int ans = 0, num = 0;
//         for (int i = s.length()-1; i >= 0; i--) {
//             switch(s.charAt(i)) {
//                 case 'I': num = 1; break;
//                 case 'V': num = 5; break;
//                 case 'X': num = 10; break;
//                 case 'L': num = 50; break;
//                 case 'C': num = 100; break;
//                 case 'D': num = 500; break;
//                 case 'M': num = 1000; break;
//             }
//             if (4 * num < ans) ans -= num;
//             else ans += num;
//         }
//        System.out.println(ans);
    }
}
