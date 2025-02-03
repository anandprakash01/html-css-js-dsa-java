package A_PracticeCodePackage;


import java.util.ArrayList;

public class dikshtras {

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

    public static void dikshtrasAlgo(ArrayList<Edge>[] graph,int src){

    };
    public static void main(String[] args){
        /*                      7
                          1➡➡➡➡➡➡3
                      2 ↗ ⬇         ⬆  ↘ 1
                      ↗   ⬇         ⬆    ↘
                     0    ⬇ 1     2 ⬆      5
                      ↘   ⬇         ⬆     ↗
                     4 ↘  ⬇         ⬆   ↗ 5
                         2 ➡➡➡➡➡ 4 ↗
                                3
         */

        ArrayList<Edge>[] graph= new ArrayList[6];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

        dikshtrasAlgo(graph,0);
    }
}
