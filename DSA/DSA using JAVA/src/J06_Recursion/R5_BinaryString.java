package J06_Recursion;

public class R5_BinaryString {
    //print all binary string of size n without consecutive one's ---->"01010100010"
    //binary string by recursion
    public static void binaryrecursive(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //to add 0 or 1
        // if(lastplace==0){
        //     binaryrecursive(n-1,0,str+'0');
        //     binaryrecursive(n-1,1,str+'1');
        // }else{
        //     binaryrecursive(n-1,0,str+'0');
        // }

        //optimized
        binaryrecursive(n-1,0,str+'0');
        if(lastplace==0){
            binaryrecursive(n-1,1,str+'1');
        }

    }
    public static void main(String args[]){
        binaryrecursive(4,0,"");
    }
}
