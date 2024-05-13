package J05_String;

public class S10_CheckStringRotation {
    public static void main(String[] args){
        String str1="ABCDE";
        String str2="CDEAB";
        //check if str2 is roation of str1
        boolean check=str1.length()==str2.length() && (str1+str1).indexOf(str2)!=-1;
        System.out.println(check);
    }
}
