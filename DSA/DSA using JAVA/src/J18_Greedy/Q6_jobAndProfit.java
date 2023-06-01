package J18_Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class Q6_jobAndProfit {
    static class job{
        //creating a job type class for storing job data
        int deadline;
        int profit;
        int id;
        job(int d,int p, int id){
            deadline=d;
            profit=p;
            this.id=id;
        }
    }
    public static void main(String[] args){
        // given an array of jobs where every job has a deadline and profit if job is finished
        // before the deadline. it has also given that every job takes a single unit of time,so the min
        // deadline for any job is 1, maximize the profit if only one job can be scheduled at a time;


        // sort according the profit;
        //{time, profit}
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new job(jobInfo[i][0],jobInfo[i][1], i));
        }
        Collections.sort(jobs, (obj1, obj2)->obj2.profit-obj1.profit); // sorting in descending of profit
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            job curr=jobs.get(i);
            if(time<curr.deadline){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max no of jobs: "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}
