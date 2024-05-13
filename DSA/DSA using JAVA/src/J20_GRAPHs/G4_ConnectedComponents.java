package J20_GRAPHs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G4_ConnectedComponents {
    static class Edge{
        int dest;
        int src;
        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean visit[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                dfsUtil(graph,i,visit);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean[] visit){
        System.out.print(curr + " ");
        visit[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfsUtil(graph,e.dest,visit);
            }
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean visit[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                bfsUtil(graph,i,visit);
            }
        }

    }
    public static void bfsUtil(ArrayList<Edge>[] graph,int curr,boolean[] visit){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr); //source
        while(!q.isEmpty()){
            curr = q.remove();
            if(!visit[curr]){
                visit[curr] = true;
                System.out.print(curr + " ");
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args){
        /*
              1-------3                  7------9
            /        |  \                |
          0          |   5-----6         |
           \         |  /                8
            2---------4
        */
        int V = 10;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }
        // 0-vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        // 1-vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        // 2-vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        // 3-vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        // 4-vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        // 5-vertex
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        // 6-vertex
        graph[6].add(new Edge(6,5));

        // 7-vertex
        graph[7].add(new Edge(7,8));
        graph[7].add(new Edge(7,9));
        // 8-vertex
        graph[8].add(new Edge(8,7));
        // 9-vertex
        graph[9].add(new Edge(9,7));

        dfs(graph);
        System.out.println();
        bfs(graph);

    }

}
