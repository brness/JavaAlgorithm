package brness.pac29.Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConnected {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a file name: ");
        int vertices=0;
        List<AbstractGraph.Edge> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        File file=new File(s.nextLine());
        if (!file.exists())
            throw new FileNotFoundException();
        Scanner inFile=new Scanner(file);
        String line=inFile.nextLine();
        vertices=Integer.parseInt(line);
        System.out.println("The number of vertices is "+vertices);

        while (inFile.hasNext()){
            String[] words=inFile.nextLine().split("[\\s+]");
            for (int i=1;i<words.length;i++){
                list.add(new AbstractGraph.Edge(Integer.parseInt(words[0].trim())
                        ,Integer.parseInt(words[i].trim())));
            }
        }

        UnWeightedGraph<Integer> graph=new UnWeightedGraph<>(list,vertices);
        graph.printEdges();
        if (graph.dfs(0).getNumberOfVerticesFound()==graph.getSize())
            System.out.println("The graph is connected");
        else
            System.out.println("The graph is not connected");
    }
}
