package J06_Recursion;

public class J8_lastOccurrence {
    static int lastOccurrence(int a[], int key, int i){
        // if(i==0){
        //     System.out.println("not-found");
        //     return -1;
        // }
        // if(a[i]==key){
        //     return i;
        // }
        // return lastOccurrence(a,key,i-1);
        if(i==a.length){
            return -1;
        }
        int isfound= lastOccurrence(a,key,i+1);

        if(isfound ==-1 && a[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int a[]={3,4,54,2,5,1,5,8,2,9};
        System.out.println(lastOccurrence(a,2,a.length-1));
    }
}
