package J03_Arrays;

public class A4_MaxSubarraysSum {
    public static void maxSubarraySum(int a[]){
        int maxsum=Integer.MIN_VALUE;
        int cs=0;
        int start=0, end=0;
        for(int i=0;i<a.length;i++){        //Time complexity O(n^3)
            for(int j=i;j<a.length;j++){
                cs=0;
                for(int k=i;k<=j;k++){
                    cs=cs+a[k];
                }
                System.out.print(cs+ ", ");
                if(cs>maxsum){
                    maxsum=cs;
                    start=i;
                    end=j;
                }
                //maxsum=Math.max(cs,maxsum);
            }
        }
        System.out.println("\nmaxsum = "+maxsum );
        System.out.println("And the subarray is from "+start+" to "+end);
        System.out.print("Subarray is : ");
        for(int i=start;i<=end;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    public static void maxsumPrefixapproch(int a[]){
        int prefixsum[]=new int[a.length];
        int cs=0;                               //Time complexity O(n^2)
        int maxsum=Integer.MIN_VALUE;
        prefixsum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefixsum[i]=prefixsum[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){        //i==Starting point
            for(int j=0;j<a.length;j++){    //j==ending point
                // if(i==0){
                //     cs=prefixsum[j];
                // }
                // else{
                //     cs=prefixsum[j]-prefixsum[i-1];
                // }
                cs= i==0? prefixsum[j] : prefixsum[j]-prefixsum[i-1];
                maxsum=Math.max(maxsum,cs);
            }
        }
        System.out.println(maxsum);
    }
    public static void kadanes(int a[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<a.length;i++){            //time complexity O(n)
            cs=cs+a[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        System.out.println(ms);
    }
    public static void main(String args[]){
        int a[]={3,2,6,1,5};
        int b[]={1,-2,6,-1,-3};
        //maxSubarraySum(b);
        maxsumPrefixapproch(b);
        kadanes(b);
    }
}
