package J14_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNo {
//    Given a number N.The task is to generate and print all binary numbers with decimal values from 1 to N.
    public static void generateBinaryNo(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s=q.remove();
            System.out.println(s);
            q.add(s+"0");
            q.add(s+"1");
        }

    }
    public static void main(String[] args){
        int n=5;
        generateBinaryNo(n);
    }
}
