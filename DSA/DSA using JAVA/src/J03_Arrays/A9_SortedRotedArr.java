package J03_Arrays;

public class A9_SortedRotedArr {
    public static int rotatedArrSearch(int arr[],int si,int ei,int target){
        if(si>ei){  //we can not use si==ei because for even size only one digit will left
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        //line 1
        if(arr[mid]>=arr[si]){
            //left in L1
            if(arr[si]<=target && target<=arr[mid]){
                return rotatedArrSearch(arr,si,mid-1,target);
            }
            else{
                return rotatedArrSearch(arr,mid+1, ei, target);
            }
        }
        //line 2 if(arr[mid]<arr[ei])
        else {
            //right in L2
            if(arr[mid]<=target && target<=arr[ei]){
                return rotatedArrSearch(arr, mid+1, ei, target);
            }
            //left in L2
            else{
                return rotatedArrSearch(arr, si, mid-1, target);
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={4,5,7,8,0,1,2,3};
        print(arr);
        System.out.println(rotatedArrSearch(arr,0,arr.length-1,7));
    }
}
