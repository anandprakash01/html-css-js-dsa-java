package J20_GRAPHs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class G10_DikshtraAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;// path based sorting for my pairs
        }
    }

    public static void dikshtra(ArrayList<Edge>[] graph,int src){
        int dist[] = new int[graph.length];
        for(int i=0;i<graph.length; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean visit[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visit[curr.n]){
                visit[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        // print All source to vertices shortest path
        for(int d : dist){
            System.out.print(d+" ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

        int src = 0;
        dikshtra(graph,src);

    }
}
