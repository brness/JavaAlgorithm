package brness.pac29.Graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execise10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a file name: ");
        Scanner s=new Scanner(System.in);
        int vertices=0;
        List<AbstractGraph.Edge> list=new ArrayList<>();
        File file=new File(s.nextLine());
        if (!file.exists()) throw new FileNotFoundException();

        Scanner inFile=new Scanner(file);
        String line=inFile.nextLine();
        vertices=Integer.parseInt(line);
        System.out.println("Enter two vertices:");
        int u=s.nextInt();
        int v=s.nextInt();
        System.out.println("The number of vertices is "+vertices);

        while (inFile.hasNext()){
            String[] words=inFile.nextLine().split("[\\s+]");
            for (int i=1;i<words.length;i++){
                list.add(new AbstractGraph.Edge(Integer.parseInt(words[0].trim())
                        ,Integer.parseInt(words[i].trim())));
            }
        }

        UnWeightedGraph graph=new UnWeightedGraph(list,vertices);
        System.out.println(graph.bfs(u).getPath(v));
    }
}
