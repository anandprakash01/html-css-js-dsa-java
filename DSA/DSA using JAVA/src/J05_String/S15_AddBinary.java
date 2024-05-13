package J05_String;

public class S15_AddBinary {
    public static void main(String[] args){
        String a="11";
        String b="1";
         int i=a.length()-1;
         int j=b.length()-1;
         String s="";
         String carry="";
         while(i>=0 && j>=0){
             char x=a.charAt(i);
             char y=b.charAt(j);
             if(x=='0'){
                 if(y=='0'){
                     if(carry=="1"){
                         s="1"+s;
                         carry="0";
                     }else{
                         s="0"+s;
                     }

                 }else{
                     if(carry=="1"){
                         s="0"+s;
                         carry="1";
                     }else{
                         s="1"+s;
                     }
                 }
             }
             else{
                 if(y=='0'){
                     if(carry=="1"){
                         s="0"+s;
                         carry="1";
                     }else{
                         s="1"+s;
                     }
                 }else{
                     if(carry=="1"){
                         s="1"+s;
                         carry="1";
                     }else{
                         s="0"+s;
                         carry="1";
                     }
                 }
             }
             i--;
             j--;
         }
         while(i>=0){
             if(carry=="1"){
                 if(a.charAt(i)=='1'){
                     s="0"+s;
                     carry="1";
                 }else{
                     s="1"+s;
                     carry="";
                 }
             }
             else{
                 if(a.charAt(i)=='1'){
                     s="1"+s;
                     carry="";
                 }else{
                     s="0"+s;
                     carry="";
                 }
             }
             i--;
         }
         while(j>=0){
             if(carry=="1"){
                 if(b.charAt(j)=='1'){
                     s="0"+s;
                     carry="1";
                 }else{
                     s="1"+s;
                     carry="";
                 }
             }
             else{
                 if(b.charAt(j)=='1'){
                     s="1"+s;
                     carry="";
                 }else{
                     s="0"+s;
                     carry="";
                 }
             }
             j--;
         }
         if(carry=="1"){
             System.out.println("1"+s);
             return;
//             return "1"+s;
         }
        System.out.println(s);
//         return s;
    }
}
