package J04_2DArrays;

public class J2_diagonalSum {
    public static void DiagonalSum(int a[][]){       //only for squareMatrix
        int n=a.length;
        //int m=a[0].length;
        int sum=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         //for primary diagonal
        //         if(i==j){
        //             sum+=a[i][j];
        //         }
        //         //for secondary diagonal
        //         if(i+j==n-1){
        //             sum+=a[i][j];
        //         }
        //     }
        // }System.out.println(sum);

        //------>optimize approach
        for(int i=0;i<n;i++){
            sum+=a[i][i];
            if(i!=n-1-i){
                sum+=a[i][n-1-i];
            }
        }
        System.out.println(sum);
        return;
    }
    public static void main(String args[]){
        // int matrix[][]={{3,4,2,1},
        //                 {2,3,4,7},
        //                 {3,8,2,1},
        //                 {4,4,3,2}};
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        DiagonalSum(matrix);
    }
}
