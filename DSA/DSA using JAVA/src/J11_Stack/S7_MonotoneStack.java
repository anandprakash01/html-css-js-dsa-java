package J11_Stack;

import java.util.Stack;
/* a monotonic stack, the elements are pushed onto the stack in a way that the top element
 of the stack always satisfies a certain order. For example, if we want to find the next greater element
  in an array, we can maintain a monotonic decreasing stack.
 */
        //next greater element for each element
public class S7_MonotoneStack {
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

        int arr[]={6,8,0,1,3};
        int next[]=new int[arr.length];
        nextGrater(arr,next);

        for(int i=0;i<next.length;i++){
            System.out.println(next[i]+" ");
        }
    }
        //the next grater element of some element x in array is the first grater
        // element that is to the right of x in the same array;
        public static void nextGrater(int arr[],int[] next){
            Stack<Integer> s=new Stack<>();

            for(int i=arr.length-1;i>=0;i--){
                while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    next[i]=-1;
                }
                else{
                    next[i]=arr[s.peek()];
                }
                s.push(i);
            }
        }
}
