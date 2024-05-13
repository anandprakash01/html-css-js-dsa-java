package J04_2DArrays;

public class A1_SpiralOrder {

    public static void SpiralOrder(int a[][],int n,int m){
        int row_start=0,col_start=0;
        int row_end=n,col_end=m;
        while(row_start<=row_end && col_start<=col_end){
            for(int col=col_start;col<=col_end;col++){
                System.out.print(a[row_start][col]+" ");
            }
            for(int row=row_start+1; row<=row_end;row++){
                System.out.print(a[row][col_end]+" ");
            }
            for(int col=col_end-1;col>=col_start;col--){
                if(row_start==row_end){
                    break;
                }
                System.out.print(a[row_end][col]+" ");
            }
            for(int row=row_end-1;row>row_start;row--){
                if(col_start==col_end){
                    break;
                }
                System.out.print(a[row][col_start]+" ");
            }
            row_start++;
            col_end--;
            row_end--;
            col_start++;
        }
        System.out.println();
        return;
    }
    public static void main(String args[]){

        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length-1;        //no of rows
        int m=matrix[0].length-1;
        SpiralOrder(matrix, n, m);
    }
}
