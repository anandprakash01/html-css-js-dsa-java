package J13_Stack;

import java.util.Stack;

        //next greater element for each element
public class Q4_MonotoneStack {
    public static void main(String[] args){
        int a[]={2,7,1,9,5,3,6,2};
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek()<a[i]){
                System.out.println(s.pop()+" ---> "+ a[i]);
            }
            s.push(a[i]);
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ---> "+ -1);
        }
    }
}
