package J05_String;

public class S14_FirstOccurrence {
//        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    public static void main(String[] args){
        String haystack="sadbutsad";
        String needle="sad";
        System.out.println(haystack.indexOf(needle));
        System.out.println(sol(haystack,needle));

    }
    public static int sol(String haystack, String needle){
        int h=haystack.length();
        int n=needle.length();
        for(int i=0; i+n<=h; i++){
            String subStr=haystack.substring(i,i+n);// i+n is exclusive
            if(subStr.equals(needle)){
                return i;
            }
        }
        return -1;

        // for(int i=0;i<h;i++){
        //     if(haystack.charAt(i)==needle.charAt(0)){
        //         int j=0;
        //         int k=i;
        //         while(k<h && j<n){
        //             if(haystack.charAt(k)!=needle.charAt(j)){
        //                 break;
        //             }
        //             k++;
        //             j++;
        //         }
        //         if(j==n){
        //             return i;
        //         }
        //         else if(k==h){
        //             return -1;
        //         }
        //     }
        // }
        // return -1;
    }
}
