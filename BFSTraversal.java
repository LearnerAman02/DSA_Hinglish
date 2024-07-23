Time Complexity --> O(E + V)
Space Complexity --> O(E + V)
/*
      1----3
     /     | \
    0      |  5 -- 6
     \     | /
      2----4
 */
	
import java.util.*;
public class Main
{
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList();
        }
        
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
        
        //now har ek edge ko print karado
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.println("src : "+e.src+" ---> "+e.dest+" : dest");
            }
        }
    }
    
    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        //starting node ko queue ke andar put kardo
        q.offer(0);
        //create a visited array
        boolean visited[] = new boolean[graph.length];
        while(!q.isEmpty()){
            int currentNode = q.poll();
            if(visited[currentNode]==true){
                continue;
            }
            else{
                //means current node already visited nhi hai
                //pehle visited mark kardo and print karado
                visited[currentNode] = true;
                System.out.print(currentNode+"-->");
                //and than usse connected jitne bhi nodes hai usko ENQUEUE karado
                for(int i=0;i<graph[currentNode].size();i++){
                    Edge e = graph[currentNode].get(i);
                    //agar already visited nhi hai tabhi enqueue karao
                    if(!visited[e.dest]){
                        q.offer(e.dest);
                    }
                }
            }
        }
        System.out.print("all nodes traversed bhau!!");
    }
    
	public static void main(String[] args) {
	    int V = 7;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		System.out.println("BFS Traversal : ");
		bfs(graph);
	}
}


class Edge{
    int src;
    int dest;
    public Edge(int s,int d){
        this.src = s;
        this.dest = d;
    }
}
