package J14_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activities {
    //you are given n activities with start time and end time, select the max no of activities that can be
    //performed by a single man. assuming that a person can only work on a single activity at a time.
    public static void main(String[] args){
        int[] start={10,12,20,31};
        int end[]={20,25,30,40};
        int[][] activity=new int[start.length][3];
        for(int i=0;i< start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        //sort according to end time;
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));//[2] sorting based on colum[2]
        ArrayList<Integer> ans=new ArrayList<>();
        int maxAct=1;
        ans.add(activity[0][0]);//first activity chosen
        int lastend=activity[0][2];
        System.out.println(activity.length);
        for(int i=1;i< activity.length;i++){
            if (activity[i][1] >= lastend) {
                maxAct++;
                lastend=activity[i][2];
                ans.add(activity[i][0]);
            }
        }
        System.out.println("max no of activities: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" "); //indexes of activity
        }
    }
}
