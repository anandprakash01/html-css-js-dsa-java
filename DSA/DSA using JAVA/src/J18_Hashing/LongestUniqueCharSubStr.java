package J18_Hashing;
import java.util.HashMap;

public class LongestUniqueCharSubStr {
    public static void main(String[] args){
        String str="anandprakash";
        HashMap<Character,Integer> hm=new HashMap<>();
        int sIdx=0;
        int endIdx=0;


        int currlen=0;
        int maxlen=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,i);
            }
            else{
                //before sIdx, even if character is repeated, that character will still be in map
                if(hm.get(ch)>=sIdx) {
                    currlen = i - sIdx;// taking that repeated character
                    sIdx = hm.get(ch) + 1;
                }
                hm.replace(ch,i);
            }
            maxlen=Math.max(currlen,maxlen);
            endIdx=i;
        }
        currlen=endIdx-sIdx+1;//this is for if last character is non-repeating
        maxlen=Math.max(maxlen,currlen);
        System.out.println(maxlen);

    }
}
