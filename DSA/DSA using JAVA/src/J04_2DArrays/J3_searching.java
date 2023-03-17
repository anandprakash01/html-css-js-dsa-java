package J04_2DArrays;

public class J3_searching {
    public static void search(int a[][],int key){   //for sorted matrix
        int row=a.length-1;
        int col=0;
        boolean check=false;
        while(row>=0 && col<a[0].length){
            if(a[row][col]==key){
                System.out.println("key fount at "+ row+","+col);
                check=true;
            }
            if(key>a[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        if(check==false){
            System.out.println("Key not found");
            return;
        }
    }
    public static void main(String args[]){
        // int matrix[][]={{3,4,2,1},
        //                 {2,3,4,7},
        //                 {3,8,2,1},
        //                 {4,4,3,2}};
        int r[][]=  {{2,3,4,6},
                {4,5,6,7},
                {5,6,7,8},
                {6,9,10,11}};
        int key=7;
        //search(r,key);
    }
}
