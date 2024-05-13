package J20_GRAPHs;

import java.util.ArrayList;
import java.util.Stack;

public class G8_TopologicalSortingDFS {

    //  works only for directed acyclic Graphs(DAG)
    /* It is a linear order of vertices such that every directed edge U➡V ,
        The vertex U comes before V.    */
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src= src;
            this.dest = dest;
        }
    }
    // O(V+E)
    public static void topSort(ArrayList<Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                topSortUtil(graph,i,visit,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean[] visit,Stack<Integer> s){
        visit[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                topSortUtil(graph,e.dest,visit,s);
            }
        }
        s.push(curr);

    }
    public static void main(String[] args){
        /*      5 ➡➡ 0 ⬅⬅ 4
                ⬇            ⬇
                2 ➡➡ 3 ➡➡ 1         */

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        topSort(graph);
    }
}
