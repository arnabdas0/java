import java.util.*;
public class GraphKosaraju {
    static class Edge{
        int src, dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topsort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topsort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void kosaRaju(ArrayList<Edge> graph[], int V){
        //step-1
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<V; i++){
            if(!vis[i]){
                topsort(graph, i, vis, s);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
    }
}
