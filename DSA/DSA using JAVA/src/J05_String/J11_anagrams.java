package J05_String;

public class J11_anagrams {
    public static void main(String[] args){
        String str1="race";
        String str2="care";
        int count=0;
        //anagrams means  all the characters of 1st are present in 2nd string and length is equal
        //first convert all to lower case
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        count++;
                    }
                }
            }
            if(count==str1.length()){
                System.out.println("strings are anagrams");
                return;
            }
            else{
                System.out.println("strings are not anagrams");
            }
        }
        else{
            System.out.println("Strings are not even equal");
        }
    }
}
