package J06_Recursion;

public class J1_isSorted {
    static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args){
        int a[]={1,2,3,5,67};
        System.out.println(isSorted(a,0));
    }
}
