package J05_String;

public class S8_StringBuilder {
    public static void StringCompression(){
        String s1="aaaiiiiijjjjjoccciwallp";
        StringBuilder s2=new StringBuilder("");
        for(int i=0;i<s1.length();i++){
            Integer count=1;
            s2.append(s1.charAt(i));
            while(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                s2.append(count.toString());
            }
        }
        System.out.println(s2);
        return;
    }

    public static void touppercase(StringBuilder sb){
        StringBuilder sb1=new StringBuilder("");
        sb1.append(Character.toUpperCase(sb.charAt(0)));
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==' ' && i<sb.length()-1){
                sb1.append(sb.charAt(i));
                i++;
                sb1.append(Character.toUpperCase(sb.charAt(i)));
            }
            else{
                sb1.append(sb.charAt(i));
            }
        }
        System.out.println(sb1);
    }
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hulk is strong");
        //for converting
        //sb.toString();
        //sb.append(sb1);   //--->We can not do this in string coz Strings are immutable
        System.out.println(sb);
        // touppercase(sb);
//         StringCompression();

        // Inbuilt Methods
        sb.insert(0,1);
        sb.insert(0,true);
        sb.insert(1," ");
        System.out.println(sb);

//        sb.reverse();
        sb.replace(0,0,"<---->");// without replacing adding at the start
//        sb.replace(1,10,"<-Anand->");
        System.out.println(sb);






    }
}
