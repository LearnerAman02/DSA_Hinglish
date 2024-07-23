Creating Undirected Weighted Graph
Time Complexity --> O(V + E)
Space Complexity --> O(V + E)
import java.util.*;
public class Main
{
    public static void createWeightedGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList();
        }
        
        graph[0].add(new Edge(0,1,4));
        graph[1].add(new Edge(1,0,4));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,-1));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,0));
        graph[3].add(new Edge(3,1,-1));
        graph[3].add(new Edge(3,2,0));
        
        //now har ek edge ko print karado
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.println("src : "+e.src+" ---> "+e.dest+" : dest, weight : "+e.weight);
            }
        }
    }
	public static void main(String[] args) {
	    int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createWeightedGraph(graph);
	}
}


class Edge{
    int src;
    int dest;
    int weight;
    public Edge(int s,int d,int w){
        this.src = s;
        this.dest = d;
        this.weight = w;
    }
}
