package brness.pac30.WeightedGraph;

import brness.pac29.Graph.AbstractGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightedEdge extends AbstractGraph.Edge implements Comparable<WeightedEdge>{
    public double weight;

    public WeightedEdge(int u,int v,double weight){
        super(u,v);
        this.weight=weight;
    }

    public int compareTo(WeightedEdge e){
        if (e.weight<weight)
            return 1;
        else if (e.weight==weight)
            return 0;
        else return -1;
    }
}
