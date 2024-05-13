package J03_Arrays;

public class A12_MissingAndRepeatingNo {
//    Given an unsorted array Arr of size N of positive integers. One number 'A' from set
//    {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
    public static void main(String[] args){
        int[] arr = {1,4,6,4,2,5,3,8};
        int n = arr.length;
        int missing = -1;
        int repeating = -1;
        for(int i=0; i<n; i++){
            // "arr[i] <= n" so for the index arr[i]-1 otherwise it will go indexOutOfBound
            int idx= Math.abs(arr[i])-1;
            if(arr[idx]<0){
                repeating= idx+1;
            }
            else{
                arr[idx] = -arr[idx];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                // if there would have been i+1 value element, then arr[i] would have never been negative
                missing = i+1;
            }
        }
        System.out.println("Missing No : " + missing);
        System.out.println("Repeating No : " + repeating);
    }
}
