package J18_Hashing;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_methods {
    public static void main(String[] args){
        HashMap<Character,String> map=new HashMap<>();
        map.put('A',"Anand");
        map.put('a',"anand");
        map.put('P',"Prakash");
        map.put('h',"hr");

        System.out.println(map);    // Direct print HashMap

        map.put('a',"adheesh");
        System.out.println(map);
        System.out.println( map.get('A') );   //get method
        System.out.println( map.get('T') );   //if not contains returns null
        System.out.println( map.containsValue("anand") );
        System.out.println( map.containsKey('P') );
        System.out.println( map.getOrDefault('T',"TPM") );
        map.remove('A');               //remove method
        System.out.println( map );
        System.out.println( map.size() );
        System.out.println( map.isEmpty() );

//        map.clear();    // deletes all values and keys... This method returns nothing
        System.out.println(map);

        // Iterations on Hashmap
//        Set<Character> keySet= map.keySet(); //using Set
//        for(Character c : keySet){
        for(Character c : map.keySet()){
            System.out.println(c + " -> "+ map.get(c));
        }
        // using EntrySet
        for(Map.Entry<Character,String> x : map.entrySet()){
            System.out.println(x.getKey() +" -> "+ x.getValue());
        }

        // using iterators
        Iterator<Map.Entry<Character, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Character, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        // forEach(action) method to iterate map
        map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));


        // looping over keys 
        for (Character key : map.keySet()){
            String val = map.get(key);
            System.out.println("Key = " + key + ", Value = " + val);
        }

    }
}
