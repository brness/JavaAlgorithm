package brness.pac30.WeightedGraph;

import brness.pac29.Graph.AbstractGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightedGraph<V> extends AbstractGraph<V>{
    public WeightedGraph(){}

    public WeightedGraph(V[] vertices,int[][] edges){
        createWeightedGraph(Arrays.asList(vertices),edges);
    }

    public WeightedGraph(int[][] edges,int numberOfVertices){
        List<V> vertices=new ArrayList<>();
        for (int i=0;i<numberOfVertices;i++){
            vertices.add((V)new Integer(i));
        }
        createWeightedGraph(vertices,edges);
    }

    public WeightedGraph(List<V> vertices,List<WeightedEdge> edges){
        createWeightedGraph(vertices,edges);
    }

    public WeightedGraph(List<WeightedEdge> edges,int numberOfVertices){
        List<V> vertices=new ArrayList<>();
        for (int i=0;i<numberOfVertices;i++){
            vertices.add((V)new Integer(i));
        }
        createWeightedGraph(vertices,edges);
    }

    private void createWeightedGraph(List<V> vertices,int[][] edges){
        this.vertices=vertices;
        for (int i=0;i<vertices.size();i++){
            neighbors.add(new ArrayList<Edge>());
        }
        for (int i=0;i<edges.length;i++){
            neighbors.get(edges[i][0]).add(new WeightedEdge(edges[i][0],edges[i][1],edges[i][2]));
        }
    }

    private void createWeightedGraph(List<V> vertices,List<WeightedEdge> edges){
        this.vertices=vertices;
        for (int i=0;i<vertices.size();i++){
            neighbors.add(new ArrayList<>());
        }

        for (int i=0;i<edges.size();i++){
            neighbors.get(edges.get(i).u).add(edges.get(i));
        }
    }

    public double getWeight(int u,int v) throws Exception{
        List<Edge> edges=neighbors.get(u);
        for (int i=0;i<edges.size();i++){
            if (edges.get(i).v==v)
                return ((WeightedEdge)edges.get(i)).weight;
        }
        throw new Exception();
    }

    public void printWeightedEdges(){
        for(int i=0;i<getSize();i++){
            System.out.print(getVerTex(i)+" ("+i+" ): ");
            for (Edge edge:neighbors.get(i)){
                System.out.print("("+edge.u+", "+edge.v+","+((WeightedEdge)edge).weight+")");
            }
            System.out.println();
        }
    }

    public boolean addEdge(int u,int v,double weight){
        return addEdge(new WeightedEdge(u,v,weight));
    }

    public class MST extends Tree{
        private double totalWeight;

        public MST(int root,int[] parent,List<Integer> searchOrder,double totalWeight){
            super(root,parent,searchOrder);
            this.totalWeight=totalWeight;
        }

        public double getTotalWeight(){
            return totalWeight;
        }
    }

    public MST getMinimumSpanningTree(){
        return getMinimumSpanningTree(0);
    }

    public MST getMinimumSpanningTree(int startingVertex){
        double[] cost=new double[getSize()];
        //这里的cost代表每个点的连接的最小边权
        for (int i=0;i<cost.length;i++)
            cost[i]=Double.POSITIVE_INFINITY;
        cost[startingVertex]=0;

        int[] parent=new int[getSize()];
        parent[startingVertex]=-1;
        double totalweight=0;

        List<Integer> T=new ArrayList<>();//这个是用来存储最小生成树的节点的列表

        while (T.size()<getSize()){
            int u=-1;
            double currentMinimum=Double.POSITIVE_INFINITY;
            for (int i=0;i<getSize();i++){
                while (cost[i]<currentMinimum&&!T.contains(i)){
                    currentMinimum=cost[i];
                    u=i;
                }
            }

            T.add(u);
            totalweight+=cost[u];

            //初始化与u相邻的点的最小的cost
            for (Edge e:neighbors.get(u)){
                if (!T.contains(e.v)&&cost[e.v]>((WeightedEdge)e).weight){
                    cost[e.v]=((WeightedEdge)e).weight;
                    parent[e.v]=u;
                }
            }
        }
        return new MST(startingVertex,parent,T,totalweight);
    }

    public ShortestPathTree getShortestPath(int sourceVertex){
        double[] cost=new double[getSize()];
        for (int i=0;i<getSize();i++){
            cost[i]=Double.POSITIVE_INFINITY;
        }
        cost[sourceVertex]=0;

        int[] parent=new int[getSize()];
        parent[sourceVertex]=-1;

        List<Integer> T=new ArrayList<>();

        while (T.size()<getSize()){
            //找出最小cost的点
            int u=-1;
            double currentMinimum=Double.POSITIVE_INFINITY;
            for (int i=0;i<getSize();i++){
                if (!T.contains(i)&&cost[i]<currentMinimum){
                    currentMinimum=cost[i];
                    u=i;
                }
            }

            T.add(u);

            //初始化与u相邻的最小的cost
            for (Edge e:neighbors.get(u)
                 ) {
                if (!T.contains(e.v)&&cost[e.v]>cost[u]+((WeightedEdge)e).weight){
                    cost[e.v]=cost[u]+((WeightedEdge)e).weight;
                    parent[e.v]=u;
                }
            }
        }
        return new ShortestPathTree(sourceVertex,parent,T,cost);
    }

    public class ShortestPathTree extends Tree{
        private double[] cost;

        public ShortestPathTree(int source,int[] parent,List<Integer> searchOrder,double[] cost){
            super(source,parent,searchOrder);
            this.cost=cost;
        }

        public double getCost(int v){
            return cost[v];
        }

        public void printAllPaths(){
            System.out.println("All shortest paths from "+vertices.get(getRoot())+" are:");
            for (int i=0;i<cost.length;i++){
                printPath(i);
                System.out.println("(cost:"+cost[i]+")");
            }
        }
    }
}
