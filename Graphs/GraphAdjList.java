import java.util.*;
public class GraphAdjList {
    int V;
    LinkedList<Integer>[] adj;

    GraphAdjList(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    void printGraph() {
        for(int i=0; i<V; i++) {
            System.out.print("Vertex " + i + ":");
            for(Integer j : adj[i]) {
                System.out.print(" -> " + j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}