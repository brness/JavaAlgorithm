package brness.pac29.Graph;

import java.util.Stack;

public class Exercise3 {
    public static class UnweightedGraphWithNoncursiveDFS<V> extends UnWeightedGraph<V>{
        public UnweightedGraphWithNoncursiveDFS(){}

        public UnweightedGraphWithNoncursiveDFS(V[] vertices,int[][] edges){
            super(vertices,edges);
        }
        public void dfsearch(int v) {
            Stack<Integer> stack=new Stack<>();
            boolean[] isVisited=new boolean[vertices.size()];
            for (int i=0;i<vertices.size();i++)
                isVisited[i]=false;

            //这里用的非递归的方式
            stack.push(v);

            while (!stack.isEmpty()){
                int out=stack.pop();
                if (!isVisited[out]){
                    isVisited[out]=true;
                    System.out.println(vertices.get(out));
                    for (Edge e:neighbors.get(out)
                         ) {
                        if (!isVisited[e.v]){
                            stack.push(e.v);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] vertices = {"Seattle", "San Francisco", "Los Angeles", "Denver", "Kansas City", "Chicago",
                "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston"};

        int[][] edges = {{0, 1}, {0, 3}, {0, 5},
                {1, 0}, {1, 2}, {1, 3},
                {2, 1}, {2, 3}, {2, 4}, {2, 10},
                {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
                {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
                {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
                {6, 5}, {6, 7},
                {7, 4}, {7, 5}, {7, 6}, {7, 8},
                {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
                {9, 8}, {9, 11},
                {10, 2}, {10, 4}, {10, 8}, {10, 11},
                {11, 8}, {11, 9}, {11, 10}};
        UnweightedGraphWithNoncursiveDFS<String> graph1 = new UnweightedGraphWithNoncursiveDFS<>(vertices, edges);
        graph1.dfsearch(graph1.getIndex("Chicago"));
    }
}
