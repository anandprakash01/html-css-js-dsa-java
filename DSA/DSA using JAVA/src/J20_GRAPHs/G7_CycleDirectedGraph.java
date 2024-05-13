package J20_GRAPHs;

import java.util.ArrayList;

public class G7_CycleDirectedGraph {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static boolean isCycle(ArrayList<Edge>[] graph){
        // DFS
        boolean[] visit = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                if(isCycleUtil(graph,i,visit,stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean[] visit,boolean[] stack){
        visit[curr]= true;
        stack[curr]= true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!visit[e.dest] && isCycleUtil(graph,e.dest,visit,stack)){
                return true;
            }

        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args){
        /*       1 ️➡➡➡ 0 ⬅⬅⬅2
                        ⬆     ⬆
                         ⬆   ⬆
                          3
        */
        int V= 4;
        ArrayList<Edge>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<Edge>();
        }

//        graph[0].add(new Edge(0,2));// for the cycle

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
//        graph[2].add(new Edge(2,3));// for the cycle

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,2));


        System.out.println(isCycle(graph));

    }


}
