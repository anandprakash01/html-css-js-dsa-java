package J03_Arrays;

public class A1_BinarySearch {

    //linear Search and Binary Search

    public static int binarysearch(int arr[],int key){  //O(log n)
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                System.out.println("Element is found at : " + mid);
                return 0;
            }
            if(arr[mid]<key){
                l=mid+1;
            }
            if(arr[mid]>key){
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //int arr[]=new int[5];
        int arr[]={1,6,10,3,5,9};

        int key=10;
        if(binarysearch(arr,key)==-1){
            System.out.println("Element is Not found");
        }
    }
}


