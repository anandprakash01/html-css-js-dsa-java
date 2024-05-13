package J20_GRAPHs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G8_TopologicalSortingBFS {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src= src;
            this.dest=dest;
        }
    }

    public static void calculateIndeg(ArrayList<Edge>[] graph,int[] indeg){

//        for(int i=0;i<graph.length;i++){
//            // neighbours
//            for(int j=0 ; j<graph[i].size();j++){
//                Edge e = graph[i].get(j);
//                indeg[e.dest]++;
//            }
//        }

        for (ArrayList<Edge> edges : graph) {
            // neighbours
            for (Edge e : edges) {
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph){
        int[] indeg = new int[graph.length];// for in-degree
        calculateIndeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        /*          5 ➡➡ 0 ⬅⬅ 4
                    ⬇            ⬇
                    2 ➡➡ 3 ➡➡ 1         */

        int src = 5,dest=1,V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        topSort(graph);
    }

}
