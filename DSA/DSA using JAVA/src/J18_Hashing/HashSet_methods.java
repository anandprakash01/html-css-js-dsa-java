package J18_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_methods {
    public static void main(String[] args){
        HashSet<String> cities=new HashSet<>();
        cities.add("Beohari");
        cities.add("Delhi");
        cities.add("Delhi");//this will not be added elements should be unique
        cities.add("Hyderabad");
        cities.add("Mumbai");

        System.out.println(cities);
        System.out.println( cities.contains("Beohari") );
        System.out.println( cities.size() );
        System.out.println( cities.remove("Delhi") );//if element exist removes and returns true if not exist returns false
        System.out.println( cities.isEmpty() );

//        set.clear();
        System.out.println(cities);

        //Iterations

        //Using enhanced for loop
        for(String i:cities){
            System.out.print(i+", ");
        }
        System.out.println();

        //using Iterator
        Iterator it=cities.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }



    }
}
