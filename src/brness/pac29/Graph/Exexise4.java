package brness.pac29.Graph;

import java.util.ArrayList;
import java.util.List;

public class Exexise4 {
    public static void main(String[] args) {
        String[] vertices = { "Seattle", "San Francisco", "Los Angeles", "Denver",
                "Kansas City", "Chicago", "Boston", "New York", "Atlanta", "Miami",
                "Dallas", "Houston", "Savannah", "Charlston" };

        int[][] edges = { { 0, 1 }, { 0, 3 }, { 0, 5 }, { 1, 0 }, { 1, 2 },
                { 1, 3 }, { 2, 1 }, { 2, 3 }, { 2, 4 }, { 2, 10 }, { 3, 0 }, { 3, 1 },
                { 3, 2 }, { 3, 4 }, { 3, 5 }, { 4, 2 }, { 4, 3 }, { 4, 5 }, { 4, 7 },
                { 4, 8 }, { 4, 10 }, { 5, 0 }, { 5, 3 }, { 5, 4 }, { 5, 6 }, { 5, 7 },
                { 6, 5 }, { 6, 7 }, { 7, 4 }, { 7, 5 }, { 7, 6 }, { 7, 8 }, { 8, 4 },
                { 8, 7 }, { 8, 9 }, { 8, 10 }, { 8, 11 }, { 9, 8 }, { 9, 11 },
                { 10, 2 }, { 10, 4 }, { 10, 8 }, { 10, 11 }, { 11, 8 }, { 11, 9 },
                { 11, 10 }, { 12, 13 }, { 13, 12 } };

        MyGraph<String> graph = new MyGraph<String>( vertices,edges);
        AbstractGraph<String>.Tree dfs = graph.dfs(graph.getIndex("Chicago"));

        System.out.println(graph.getConnectedComponent());
    }

    public static class MyGraph<V> extends UnWeightedGraph<V>{
        public MyGraph(){}

        public MyGraph(V[] list,int[][] edges){
            super(list,edges);
        }

        public List<List<Integer>> getConnectedComponent(){
            List<List<Integer>> list = new ArrayList<List<Integer>>();

            List<Integer> vertexIndices = new ArrayList<Integer>();
            for (int i = 0; i < vertices.size(); i++)
                vertexIndices.add(i);

            while (vertexIndices.size() > 0) {
                //直接查找某个顶点的对应的深度树
                Tree tree = dfs(vertexIndices.get(0));
                //将里面的顶点都插入list
                list.add(tree.getSearchOrder());
                //将这些顶点从indice中移除，好进行下一次查找
                vertexIndices.removeAll(tree.getSearchOrder());
            }

            return list;
        }
    }
}
