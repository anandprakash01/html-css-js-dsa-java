package J17_Heap;

import java.util.PriorityQueue;

public class Q1_nearByCar {
    //  we are given n points in 2d plane which are locations of cars.
    //  if we are at the origin print the nearest k cars
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;
        public Point(int x,int y,int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq-p2.distSq;
        }


    }
    public static void main(String[] args){
        int[][] points ={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Point> pq=new PriorityQueue<>();

        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];

            int distSq=x*x + y*y; //distance from root(origin)
            pq.add(new Point(x,y,distSq,i));

        }
        for(int i=0;i<k;i++){
            System.out.println(i+1+" Nearest Point ->"+  pq.remove().idx);
        }
    }
}
