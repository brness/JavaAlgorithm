package brness.pac29.Graph;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class Execise2 {
    public static void main(String[] args) throws IOException{
        int[][] edges = {
                {0, 1}, {0, 3}, {0, 5},
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
                {11, 8}, {11, 9}, {11, 10}
        };
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> nodes=new ArrayList<>();

        for (int i=0;i<edges.length;i++){
            if (!nodes.contains(edges[i][0])){
                nodes.add(edges[i][0]);
                list.add(new ArrayList<>());
            }
            list.get(nodes.indexOf(edges[i][0])).add(edges[i][1]);
        }

        File file=new File("graph.txt");
        if (file.exists()){
            System.out.println("File already exist");
            System.exit(0);
        }
        PrintWriter writer=new PrintWriter(file);
        writer.println(list.size());
        for (int i=0;i<list.size();i++){
            writer.print(nodes.get(i));
            for (int j=0;j<list.get(i).size();j++){
                writer.print(" "+list.get(i).get(j));
            }
            writer.println();
        }
        writer.close();
    }
}
