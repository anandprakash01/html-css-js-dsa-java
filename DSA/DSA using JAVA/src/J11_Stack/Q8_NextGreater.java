package J11_Stack;

import java.util.Stack;
public class Q8_NextGreater {
    /* Next greater element of some element x in array is the first greater element
     that is to the right of the x in array
     */
    public static void main(String[] args){
        int[] arr ={6,8,0,1,3};
        int[] nextGreater =new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
//            while(!st.isEmpty() && st.peek()<arr[i]){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){// for pushing index
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[st.peek()];
            }
//            st.push(arr[i]);
            st.push(i);
        }
        for (int i : nextGreater) {
            System.out.print(i + " ");
        }

    }
}
