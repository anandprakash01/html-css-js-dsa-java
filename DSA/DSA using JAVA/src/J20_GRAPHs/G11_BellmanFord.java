package J20_GRAPHs;

import java.util.ArrayList;

public class G11_BellmanFord {

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

    public static void bellmanFord(ArrayList<Edge>[] graph,int src){
        int V=graph.length;
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        // V-1 times  TC- O(V*E)
        for(int i=0; i<V-1; i++){
            // edges-> O(E)
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e= graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt= e.wt;
                    //relaxation step
                    if( dist[u] != Integer.MAX_VALUE && dist[u]+ wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }

            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
    }

    // simpler way ----> TC O(V*E) same
    public static void bellmanFord2(ArrayList<Edge> graph,int src,int V){
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        // V-1 times  TC- O(V*E)
        for(int i=0; i<V-1; i++){
            // edges-> O(E)
            for(int j=0; j<graph.size(); j++){
                Edge e= graph.get(j);
                int u = e.src;
                int v = e.dest;
                int wt= e.wt;

                if( dist[u] != Integer.MAX_VALUE && dist[u]+ wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args){
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));
        graph[4].add(new Edge(4,1,-1));

        bellmanFord(graph,0);
        System.out.println();

        //graph2 for only edges
        ArrayList<Edge> graph2 = new ArrayList<>();
        graph2.add(new Edge(0,1,2));
        graph2.add(new Edge(0,2,4));
        graph2.add(new Edge(1,2,-4));
        graph2.add(new Edge(2,3,2));
        graph2.add(new Edge(3,4,4));
        graph2.add(new Edge(4,1,-1));

        bellmanFord2(graph2,0,V);

    }
}
