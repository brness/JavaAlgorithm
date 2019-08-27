package brness.pac29.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractGraph<V> implements Graph<V> {
    protected List<V> vertices=new ArrayList<>();
    protected List<List<Edge>> neighbors=new ArrayList<>();

    protected AbstractGraph(){}

    protected AbstractGraph(V[] vertices,int[][] edges){
        for (int i=0;i<vertices.length;i++)
            addVertex(vertices[i]);

        createAdjacencyLists(edges,vertices.length);
    }

    protected AbstractGraph(List<V> vertices,List<Edge> edges){
        for (int i=0;i<vertices.size();i++)
            addVertex(vertices.get(i));

        createAdjacencyLists(edges,vertices.size());
    }

    protected AbstractGraph(List<Edge> edges,int numberOfVertices){
        for (int i=0;i<numberOfVertices;i++)
            addVertex((V)(new Integer(i)));

        createAdjacencyLists(edges,numberOfVertices);
    }

    protected AbstractGraph(int[][] edges,int numberOfVertices){
        for (int i=0;i<numberOfVertices;i++)
            addVertex((V)(new Integer(i)));

        createAdjacencyLists(edges,numberOfVertices);
    }

    private void createAdjacencyLists(int[][] edges,int numberOfVertices){
        for (int i=0;i<edges.length;i++)
            addEdge(edges[i][0],edges[i][1]);//这里相当于是将edge[i][0]与edge[i][1]相连
    }

    private void createAdjacencyLists(List<Edge> edges,int numberOfVertices){
        for (Edge edge:edges){
            addEdge(edge.u,edge.v);
        }
    }

    public int getSize(){
        return vertices.size();
    }

    @Override
    public List<V> getVertices() {
        return vertices;
    }

    public V getVerTex(int index) {
        return vertices.get(index);
    }

    @Override
    public int getIndex(V v) {
        return vertices.indexOf(v);
    }

    @Override
    public List<Integer> getNeighbors(int index) {
        List<Integer> result=new ArrayList<>();
        for (Edge e:neighbors.get(index))
            result.add(e.v);
        return result;
    }

    @Override
    public int getDegree(int v) {
        return neighbors.get(v).size();
    }

    public void printEdges(){
        for (int u=0;u<neighbors.size();u++){
            System.out.print(getVerTex(u)+" ("+u+"): ");
            for (Edge e:neighbors.get(u)){
                System.out.print("("+getVerTex(e.u)+","+getVerTex(e.v)+")");
            }
            System.out.println();
        }
    }
    @Override
    public void clear() {
        vertices.clear();
        neighbors.clear();
    }

    @Override
    public boolean addVertex(V vertex){
        if (!vertices.contains(vertex)){
            vertices.add(vertex);
            neighbors.add(new ArrayList<Edge>());
            return true;
        }
        else return false;
    }

    protected boolean addEdge(Edge e){
        if (e.u<0||e.u>getSize()-1)
            throw new IllegalArgumentException("No Such index: "+e.u);
        if (e.v<0||e.v>getSize()-1)
            throw new IllegalArgumentException("No Such index: "+e.v);
        if (!neighbors.get(e.u).contains(e)){
            neighbors.get(e.u).add(e);
            return true;
        }
        else return false;
    }

    @Override
    public boolean addEdge(int u,int v){
        return addEdge(new Edge(u,v));
    }

    public static class Edge{
        public int u;
        public int v;

        public Edge(int u,int v){
            this.u=u;
            this.v=v;
        }

        public boolean equals(Object o){
            return u==((Edge)o).u&&v==((Edge)o).v;
        }
    }


//    public boolean isCycle(){
//
//    }

    @Override
    public Tree dfs(int v) {
        List<Integer> searchOrder=new ArrayList<>();
        int[] parent=new int[vertices.size()];
        for (int i=0;i<parent.length;i++)
            parent[i]=-1;

        boolean[] isVisited=new boolean[vertices.size()];
        dfs(v,parent,searchOrder,isVisited);

        return new Tree(v,parent,searchOrder);
    }

    private void dfs(int u,int[] parent,List<Integer> searchOrder,boolean[] isVisited){
        searchOrder.add(u);
        isVisited[u]=true;

        for (Edge e:neighbors.get(u)){
            if (!isVisited[e.v]){
                parent[e.v]=u;
                dfs(e.v,parent,searchOrder,isVisited);
            }
        }
    }

    public Tree bfs(int v){
        List<Integer> searchOrder=new ArrayList<>();
        int[] parent=new int[vertices.size()];
        for (int i=0;i<parent.length;i++){
            parent[i]=-1;
        }

        LinkedList<Integer> queue=new LinkedList<>();
        boolean[] isVisited=new boolean[vertices.size()];
        queue.offer(v);
        isVisited[v]=true;

        while (!queue.isEmpty()){
            int u=queue.poll();
            searchOrder.add(u);
            for (Edge e:neighbors.get(u)){
                if (!isVisited[e.v]) {
                    queue.offer(e.v);
                    parent[e.v] = u;
                    isVisited[e.v] = true;
                }
            }
        }

        return new Tree(v,parent,searchOrder);
    }

    public List<V> getPath(int u,int v){
        return this.bfs(u).getPath(v);
    }

    public class Tree{
        private int root;
        private int[] parent;
        private List<Integer> searchOrder;

        public Tree(int root,int[] parent,List<Integer> searchOrder){
            this.root=root;
            this.parent=parent;
            this.searchOrder=searchOrder;
        }

        public int getRoot(){
            return root;
        }

        public int getParent(int v) {
            return parent[v];
        }

        public List<Integer> getSearchOrder() {
            return searchOrder;
        }

        public int getNumberOfVerticesFound(){
            return searchOrder.size();
        }

        public List<V> getPath(int index){
            ArrayList<V> path=new ArrayList<>();

            do {
                path.add(vertices.get(index));
                index=parent[index];
            }while (index!=-1);

            return path;
        }

        public void printPath(int index){
            List<V> path=getPath(index);
            System.out.print("A path from "+vertices.get(root)+" to "+vertices.get(index)+": ");
            for (int i=path.size()-1;i>=0;i--){
                System.out.print(path.get(i)+" ");
            }
        }

        public void printTree(){
            System.out.println("Root is: "+vertices.get(root));
            System.out.print("Edges: ");
            for (int i=0;i<parent.length;i++){
                if (parent[i]!=-1){
                    System.out.print("("+vertices.get(parent[i])+","+vertices.get(i)+")");
                }
            }
            System.out.println();
        }
    }
}
