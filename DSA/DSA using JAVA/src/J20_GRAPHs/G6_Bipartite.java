package J20_GRAPHs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G6_Bipartite {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
     /* if graph is:
            Acyclic---> Always Bipartite Graph
            Cyclic---> No of Node EVEN--->Bipartite
            Cyclic---> ODD ----> Not Bipartite
     */
    public static boolean isBipartite(ArrayList<Edge>[] graph){// O(V+E)
        int col[] = new int[graph.length];// for graph coloring
        for(int i=0;i<graph.length;i++){
            col[i] = -1;// No color
        }
        //BFS
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0; // Pink Color
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]){
                            return false;// Not Bipartite
                        }
                        // for different color=> continue
                    }
                }
            }
        }
        return true;

    }
    public static void main(String[] args){
        /*          0-----2
                    |      \
                    1       4
                     \    /
                        3
        */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

//        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));

        System.out.println(isBipartite(graph));
    }
}
