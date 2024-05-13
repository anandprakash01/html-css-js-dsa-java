package J11_Stack;

import java.util.Stack;

public class S13_Histogram {
    public static void main(String[] args) {
        int[] Height = {2, 1, 5, 6, 2, 3};
        area(Height);
    }

    // given an array if integer heights representing the histogram, where width is 1, return area of the largest rectangle
    public static void area(int[] h) {

        int[] NSL = new int[h.length];
        int[] NSR = new int[h.length];
        // for next smaller left reverse the loop and condition (Next grater right)
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < h.length; i++) {
            while (!s.isEmpty() && h[s.peek()] >= h[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                NSL[i] = -1;
            } else {
                NSL[i] = s.peek();
            }
            s.push(i);
        }
        // for next smaller right
        s = new Stack<>();        //to empty stack
        for (int i = h.length-1; i >= 0; i--) {
            while (!s.isEmpty() && h[s.peek()] >= h[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                NSR[i] = h.length;
            } else {
                NSR[i] = s.peek();
            }
            s.push(i);
        }
        //for area
        int mxarea=0;
        for(int i=0;i<h.length;i++){
            int width=NSR[i]-NSL[i]-1;
            int height=h[i];
            int currarea=width*height;
            mxarea=Math.max(currarea,mxarea);
        }
        System.out.println("max area: "+mxarea);
    }
}
