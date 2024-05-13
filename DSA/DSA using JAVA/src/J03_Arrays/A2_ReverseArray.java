package J03_Arrays;

public class A2_ReverseArray {
    public static void reverse(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        //int arr[]=new int[6];
        int arr[]={5,6,3,7,17,34};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}

