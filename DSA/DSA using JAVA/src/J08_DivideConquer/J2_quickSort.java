package J08_DivideConquer;

public class J2_quickSort {
    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIidx=partition(arr,si,ei);
        Quicksort(arr,si,pIidx-1);  //left part
        Quicksort(arr,pIidx+1,ei);  //right part
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ei]=temp;
        return i;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={3,4,0,1,3,6,8,2};
        Quicksort(arr,0,arr.length-1);
        print(arr);
    }
}
