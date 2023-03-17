package J05_String;

public class J5_compression {
    public static void StringCompression(){
        String s1="aaaiiiiijjjjjoccciwalll";
        String s2="";
        for(int i=0;i<s1.length();i++){
            Integer count=1;
            s2+=s1.charAt(i);
            while(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                s2+=count.toString();       //String.valueOf(i) it converts direct int to string
            }
        }
        System.out.println(s2);
        return;
    }
    public static void main(String[] args){
        StringCompression();;
    }
}
