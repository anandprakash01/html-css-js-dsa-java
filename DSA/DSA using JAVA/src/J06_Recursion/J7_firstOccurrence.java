package J06_Recursion;

public class J7_firstOccurrence {
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            System.out.println("not found");
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String args[]){
        int a[]={3,4,54,2,5,1,5,8,2,9};
        System.out.println(firstOccurence(a,2,0));
    }
}
