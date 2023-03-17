package J03_Arrays;

public class J5_trappedWater {

    public static void main(String args[]){
        int hight[]={3,2,0,4,2,1,3};
        int wt=0;       //watertrapped
        int left[]=new int[hight.length];
        int right[]=new int[hight.length];
        //left boundries
        left[0]=hight[0];
        for(int i=1;i<hight.length;i++){
            left[i]=Math.max(left[i-1],hight[i]);
        }
        right[hight.length-1]=hight[hight.length-1];
        for(int i=hight.length-2;i>=0;i--){
            right[i]=Math.max(hight[i],right[i+1]);
        }
        for(int i=0;i<hight.length;i++){
            //current water trapped
            wt= wt+  Math.min(left[i],right[i]) -hight[i];
        }
        System.out.println(wt);

    }
}
