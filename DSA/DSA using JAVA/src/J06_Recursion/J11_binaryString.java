package J06_Recursion;

public class J11_binaryString {
    //print all binary string of size n without consecutive one's ---->"01010100010"
    //binarystr by recursion
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

        //optimized from above
        binaryrecursive(n-1,0,str+'0');
        if(lastplace==0){
            binaryrecursive(n-1,1,str+'1');
        }

    }
    public static void main(String args[]){
        binaryrecursive(4,0,"");
    }
}
