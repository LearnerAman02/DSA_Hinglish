GRAPH CREATION using Adjacency List
Time Complexity --> O(V)*O(E)
import java.util.*;
public class Main
{
    public static void createGraph(ArrayList<Edge> graph[]){
        //by default har ek index par NULL value stored hogi
        for(int i=0;i<graph.length;i++){
            System.out.println(graph[i]);
        }
        //isiliye agar hume ArrayList of Edges agar store krna hai toh pehle ar jagah empty ArrayList se initialize 
        //krna hoga cheezon ko
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList();
        }
        
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        
        //now printing the Edges
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print("src : "+e.src+" ----> "+e.dest+" : dest");
                System.out.println();
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
	}
}

class Edge{
    int src;
    int dest;
    Edge(int s,int d){
        this.src = s;
        this.dest = d;
    }
}
