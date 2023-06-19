package J14_Greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolateProblem {
    // chocolate problem    //min cost of breaking
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer[] CostVer = {2, 1, 3, 1, 4};
        Integer[] CostHor = {4, 1, 2};
        Arrays.sort(CostVer, Collections.reverseOrder());
        Arrays.sort(CostHor,Collections.reverseOrder());
        int h=0,    v=0;//pointers
        int hp=1,   vp=1;//vertical and horizontal pieces
        int cost=0;
        while(h<CostHor.length && v<CostVer.length){
            if(CostVer[v]<=CostHor[h]){//horizontal cut
                cost+=CostHor[h]*vp;
                hp++;
                h++;
            }
            else{                   //vertical cut
                cost+=CostVer[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<CostHor.length){
            cost+=CostHor[h]*vp;
            hp++;
            h++;
        }
        while(v<CostVer.length){
            cost+=CostVer[v]*hp;
            vp++;
            v++;
        }
        System.out.println("Min cost of cuts:"+cost);
    }
}
