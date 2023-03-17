package J09_HashMap;

import java.util.HashMap;

                    //Longest Unique characters Substring
public class NASD{
    public static void main (String[] args) {

        String str="andgj349(laoj++aifa";
        int stIdx=0;//starting idx for curr substring
        int maxlen=0;
        int currlen=0;
        HashMap<Character,Integer> myMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!myMap.containsKey(ch)) {
                myMap.put(ch, i);
            }
            else{
                if(myMap.get(ch)>=stIdx){
                    currlen=i-stIdx;
                    stIdx=myMap.get(ch)+1;
                }

                myMap.replace(ch,i);
            }

            maxlen=Math.max(maxlen,currlen);
        }
        System.out.println(maxlen);
    }
}
