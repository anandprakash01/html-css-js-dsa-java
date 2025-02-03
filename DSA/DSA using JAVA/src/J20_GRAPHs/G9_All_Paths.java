package J20_GRAPHs;

import java.util.ArrayList;

public class G9_All_Paths {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    // O(V^v)
    public static void printAllPath(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
        }
        // DFS
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            printAllPath(graph,e.dest,dest,path+src);
        }
    }
    public static void main(String[] args) {
        /*          5 ➡➡ 0 ⬅⬅ 4
                    ⬇     ⬇      ⬇
                    2 ➡➡ 3 ➡➡ 1         */

        int src = 5,dest=1,V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        printAllPath(graph,src,dest,"");
    }
}
