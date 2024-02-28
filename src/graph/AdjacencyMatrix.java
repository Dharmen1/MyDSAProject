package graph;

public class AdjacencyMatrix {

    private int V; // number of vertices in the graph
    private int E; // number of edges in the graph
    private int[][] adjMatrix;

    public AdjacencyMatrix(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    private void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++){
            sb.append(v + ": ");
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjacencyMatrix adj = new AdjacencyMatrix(4);
        adj.addEdge(0, 1);
        adj.addEdge(1, 2);
        adj.addEdge(2, 3);
        adj.addEdge(3, 0);
        System.out.println(adj);
    }

}
