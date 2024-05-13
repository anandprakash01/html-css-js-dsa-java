package J20_GRAPHs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// using as Adjacency list (list of lists)
public class G2_BFS_DFS {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[graph.length];
        q.add(0); // source

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visit[curr]){
                System.out.print(curr + " ");
                visit[curr] = true;
                // adding neighbours to queue
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] visit){
        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfs(graph,e.dest,visit);
            }
        }

    }

    public static void main(String[] args){
         /*
                          1-------3
                        /        |  \
                      0          |   5-----6
                       \         |  /
                        2---------4
        */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int i=0; i<V; i++){
            graph[i]=new ArrayList<>();
        }

        // 0's vertices
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        // 1's vertices
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        // 2's vertices
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        // 3's vertices
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        // 4's vertices
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        // 5's vertices
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        // 6's vertices
        graph[6].add(new Edge(6,5,1));

        // neighbours
//        for(int i=0; i<graph[4].size(); i++){
//            Edge e= graph[4].get(i);
//            System.out.print(e.dest + " ");
//        }
//        bfs(graph);
        dfs(graph,0,new boolean[V]);
    }
}
