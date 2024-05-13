package J05_String;

public class S4_SubString {
    public static void substring(String str,int s,int e){
        String substr="";
        for(int i=s;i<e;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
        //inbuilt fun
        //System.out.println(str.substring(0,5));
    }
    public static void main(String[] args){
        String str="anandp";
        substring(str,0,5);
    }
}
