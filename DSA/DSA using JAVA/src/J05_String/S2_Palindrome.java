package J05_String;

public class S2_Palindrome {
    public static void Palindrome(){
        String s1="aantnaa";        //A and a both are different
        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                System.out.println("This is not palindrome");
                return;
            }
        }
        System.out.println("This is palindrome");

    }
    public static void main(String args[]){
        Palindrome();
    }
}
