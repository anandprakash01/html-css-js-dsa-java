package J05_String;

public class S12_ConsecutiveOnes {
    //print binary string of size n without consecutive one's ---->"01010100010"
    public static void binarystr(String str){
        int n=str.length();
        System.out.print(str.charAt(0));
        for(int i=1;i<n;i++){
            if(str.charAt(i-1)!='1' || str.charAt(i)=='0'){
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String args[]){
        //anagrams(str1,str2);
        binarystr("0101110001101");
    }
}
