package J06_Recursion;

public class J10_duplicateStr {

    //non-static method
    public void duplicateRemovedstr(String str,int idx,String newstr, boolean map[]){
        char currchar=str.charAt(idx);
        if(idx==str.length()-1){
            System.out.print(newstr);
            return;
        }
        if(map[currchar-'a']==true){
            duplicateRemovedstr(str,idx+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            duplicateRemovedstr(str,idx+1,newstr+currchar,map);
        }
    }
    public static void main(String args[]) {
        String str = "anandprakash";
        boolean map[] = new boolean[26];

        //for calling a non-Static method we have to call it by creating an object
        J10_duplicateStr obj = new J10_duplicateStr();
        obj.duplicateRemovedstr(str, 0, "", map);
    }
}
