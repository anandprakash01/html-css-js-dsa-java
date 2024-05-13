package J07_DivideConquer;

public class D1_MergeSort { //O(n log n)
    public static void mergesort(int arr[],int si,int ei){
        int mid=si+(ei-si)/2;
        if(si>=ei){
            return;
        }
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int[] temp =new int[ei-si+1];
        int i=si;   //iterator for first part
        int j=mid+1;   //iterator for second part
        int k=0;    //iterator for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={4,9,5,2,6,0,1,3};
        mergesort(arr,0,arr.length-1);
        print(arr);
    }
}
