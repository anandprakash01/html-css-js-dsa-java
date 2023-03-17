package ArrayList;
import java.util.ArrayList;

public class J4_ArrayListQ3 {
    // find any pair in rotated and sorted ArrayList that has terget sum
    public static void main(String[] args){
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(8);
        arrlist.add(9);
        arrlist.add(10);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(7);
        int tar=17;
        // check pivot/breaking point
        int i=1;
        for(;i<arrlist.size();i++){
            if(arrlist.get(i-1)>arrlist.get(i)){
                break;
            }
        }
        int n=arrlist.size();
        int j=i-1;//right pointer
        while(i!=j){
            int sum=arrlist.get(i)+arrlist.get(j);
            if(sum==tar){
                System.out.println("The pair indexes are: "+i+", "+j);
                return;
            }else if(sum>tar){
                j= (n+j-1)%n;
            }else{
                i=(i+1)%n;
            }
        }
        System.out.println("Not found");
    }
}
