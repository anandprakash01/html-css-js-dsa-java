package J20_GRAPHs;

import java.util.ArrayList;

public class G5_CycleDetection {

    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                if(detectCycleUtil(graph, visit, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean[] visit,int curr,int parent){
        //dfs
        visit[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            // case:3
            if(!visit[e.dest]){
                if(detectCycleUtil(graph,visit,e.dest,curr)){
                    return true;
                }
            }
            // case:1
            else if(visit[e.dest] && e.dest !=parent){
                return true;
            }
            // case:2 continue(visited and e.dest==parent)
        }
        return false;
    }

    public static void main(String[] args){
        /*
              1-------3                  7-----9
            /          \                |   /
          0             5-----6         | /
           \           /                8
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
        graph[3].add(new Edge(3,5));
        // 4-vertex
        graph[4].add(new Edge(4,2));
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
//        graph[8].add(new Edge(8,9));
        // 9-vertex
        graph[9].add(new Edge(9,7));
//        graph[9].add(new Edge(9,8));

        System.out.println(detectCycle(graph));

    }
}
