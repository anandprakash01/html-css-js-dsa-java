package J17_Heap;

public class Q1 {
    // sum of every kth window;
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, -1, 3, 4 };
        int n = arr.length;
        int k = 3;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == k) {
                System.out.print(sum + " ");
            }
            sum += arr[i];
            if (i >= k) {
                sum -= arr[i - k];
                System.out.print(sum + " ");
            }
        }
    }
}
