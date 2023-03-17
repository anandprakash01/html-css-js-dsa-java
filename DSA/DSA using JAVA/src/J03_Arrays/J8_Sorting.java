package J03_Arrays;

public class J8_Sorting {
    //inbuilt fun---->Arrays.sort(arr)
    public static void BubbleSort(int a[]){     //O(n^2)
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void SelectionSort(int a[]){      //O(n^2)
        for(int i=0;i<a.length;i++){
            int minpos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minpos]>a[j]){
                    minpos=j;
                }
            }
            int temp =a[i];
            a[i]=a[minpos];
            a[minpos]=temp;
        }
    }
    public static void InsertionSort(int a[]){      //O(n^2)
        int n=a.length;
        for(int i=1;i<n;i++){
            int curr=a[i];
            int pre=i-1;
            while(pre>=0 && a[pre]>curr){
                a[pre+1]=a[pre];
                pre--;
            }
            a[pre+1]=curr;
        }
    }
    public static void countSort(int a[]){      //for small range
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<largest;i++){
            count[a[i]]++;
        }
        // for(int i=0;i<largest;i++){
        //     System.out.println(count[i]);
        // }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                count[i]--;
                j++;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={3,5,6,9,2,3,8,1,0};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        // int a[]=new int[10];
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<10;i++){
        //     a[i]=sc.nextInt();
        // }
        BubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        countSort(arr);
        //    ======>>Inbuilt fun-----> Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
