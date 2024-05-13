package J06_Recursion;

public class R1_Basic {

    static boolean isSorted(int[] arr, int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    static int nthFibonacci(int n){
        if(n==0 ||n==1){
            return n;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }

    public static int sumTillN(int n){
        //sum of 1st n natural no
        if(n==1){
            return 1;
        }
        return n+sumTillN(n-1);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void printNumDecreasing(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        System.out.print(n+" ");
        printNumDecreasing(n-1);
    }

    public static void printNumIncreasing(int n){
        if(n==0){
            System.out.print(0+" ");
            return;
        }
        printNumIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,5,67};
        System.out.println(isSorted(a,0));

        int n=6;
        int fib=nthFibonacci(n);
        System.out.println(fib);
        System.out.println(sumTillN(5));

        System.out.println(factorial(5));

        printNumDecreasing(10);
        printNumIncreasing(10);

    }
}
