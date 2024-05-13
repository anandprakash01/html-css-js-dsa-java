package J06_Recursion;

public class R3_First_LastOccurrence {
    public static int firstOccurrence(int[] arr, int key, int i){
        if(i==arr.length){
            System.out.println("not found");
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr,key,i+1);
    }
    public static int lastOccurrence(int[] a,int key,int i){
        // for index from the end
        // if(i==0){
        //     System.out.println("not-found");
        //     return -1;
        // }
        // if(a[i]==key){
        //     return i;
        // }
        // return lastOccurrence(a,key,i-1);

        // index from the Start
        if(i==a.length){
            return -1;
        }
        int isFound = lastOccurrence(a,key,i+1);

        if(isFound ==-1 && a[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
        int[] a ={3,4,54,2,5,1,5,8,2,9};
        System.out.println(firstOccurrence(a,2,0));

        System.out.println(lastOccurrence(a,2,0));
    }
}
