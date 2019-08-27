package brness.pac29.Graph;

import java.util.List;

public class UnWeightedGraph<V> extends AbstractGraph<V> {
    public UnWeightedGraph(){}

    public UnWeightedGraph(V[] vertices,int[][] edges){
        super(vertices,edges);
    }

    public UnWeightedGraph(List<V> vertices,List<Edge> edges){
        super(vertices,edges);
    }

    public UnWeightedGraph(List<Edge> edges,int numberofVertices){
        super(edges,numberofVertices);
    }

    public UnWeightedGraph(int[][] edges,int numberOfVertices){
        super(edges, numberOfVertices);
    }
}
