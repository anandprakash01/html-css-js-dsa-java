package J13_Stack;

import java.util.Stack;

public class Q4_StockSpanProblem {
    public static void main(String[] args){
        int prizes[]={100,80,60,70,60,85,100};
        int span[]=new int[prizes.length];
        span(prizes,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }

    //max no of consecutive days for which prize<=today's prize
    public static void span(int prize[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=0;i<prize.length;i++) {
            int curr = prize[i];
            while (!s.isEmpty() && curr>=prize[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prehigh=s.peek();
                span[i]=i-prehigh;
            }
            s.push(i);
        }
    }
}
