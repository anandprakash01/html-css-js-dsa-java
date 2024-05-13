package J05_String;

public class S13_LongestCommonPrefix {
//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String[] strs=new String[n];
//        for(int i=0;i<n;i++){
//            strs[i]=sc.nextLine();
//        }
        String[] strs={"flower","flow","flight"};
        if(strs==null || strs.length==0) return;
        String sub=strs[0];
        for(int i=1;i<strs.length;i++){
//            while (!strs[i].startsWith(sub)){
            while(strs[i].indexOf(sub)!=0){
                sub=sub.substring(0,sub.length()-1);
                if(sub.length()==0){
                    return;
                }
            }
        }
        System.out.println(sub);

//         Arrays.sort(strs);
//         String s1=strs[0];
//         String s2=strs[strs.length-1];
//         int idx=0;
//         String ans="";
//         while(idx<s1.length() && idx<s2.length()){
//             if(s1.charAt(idx)==s2.charAt(idx)){
//                 // ans+=s1.charAt(idx);
//                 ans+=String.valueOf(s1.charAt(idx));;
//                 idx++;
//             }else{
//                 break;
//             }
//         }
//         return ans;

    }
}

