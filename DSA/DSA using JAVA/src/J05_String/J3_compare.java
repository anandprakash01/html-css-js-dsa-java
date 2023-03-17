package J05_String;

public class J3_compare {
    public static void compare(){
        String s1="anand";
        String s2="prakash";
        s1.compareTo(s2);
        //if it is 0 then strings are equal
        // <0 than s1<s2
        // >0 then s1>s2
        System.out.println(s1.compareTo(s2));
        String s3[]={"Anand","Prakash","hr"};
        String largest=s3[0];
        for(int i=0;i<s3.length;i++){
            if(largest.compareTo(s3[i])<0){
                largest=s3[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        compare();
    }
}
