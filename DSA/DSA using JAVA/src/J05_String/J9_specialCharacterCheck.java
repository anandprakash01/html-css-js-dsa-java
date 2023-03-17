package J05_String;

public class J9_specialCharacterCheck {
    public static void specialcharcheck(String str){
        int count=0;
        String specialcharstr="";
        String nonspecialcharstr="";
        for(int i=0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))){
                count++;
                specialcharstr+=str.charAt(i);
            }
            else{
                nonspecialcharstr+=str.charAt(i);
            }
        }
        if(count==0){
            System.out.println("String does not have special characters");
        }
        else{
            System.out.println("String has special character");
            System.out.println("The Special char string is:\n"+specialcharstr);
            System.out.println("The removed special char string is:\n"+nonspecialcharstr);
        }
    }
    public static void main(String[] args){
        String str="anand prakash&*01 ";
        specialcharcheck(str);
    }
}
