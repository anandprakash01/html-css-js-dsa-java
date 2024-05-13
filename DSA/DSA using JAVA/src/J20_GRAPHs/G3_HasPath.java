package J20_GRAPHs;

import java.util.ArrayList;

public class G3_HasPath {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    //DFS
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visit){
        if(src==dest) return true;
        visit[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e= graph[src].get(i);
            if(!visit[e.dest] && hasPath(graph,e.dest,dest,visit)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        /*
                1 ------- 3
              /          | \
             0           |  5-------6
              \          | /
               2 ------- 4
        */
        int V= 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0; i<V; i++) {
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

//        boolean visit[]=new boolean[V];
        System.out.println(hasPath(graph,0,5,new boolean[V]));
    }

}
