package DSA_COURSE_PLAYLIST;

// Depth First Search traversal (DFS)

import java.util.*;

public class _28_GRAPH_Implement_DFS_Traversal {

    static class Graph{

        private int V;   // No.of Vertices(Nodes)
        private LinkedList<Integer>adj[]; // Adjecency List

        // Constructor

        public Graph(int v){  // No.of Vertices(Nodes)
            V=v;
            // Create an Object of LinkedList

            adj= new LinkedList[v];

            // Create an Array of Same no.of vertices.
            // Each and Individual Elements in this Array Connected with LinkedList.

            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<Integer>();
            }
        }

        // Function to add an edge Bet.2 Vertexs into the graph

        public void addEdge(int s,int d){
            adj[s].add(d);
        }

        // prints DFS traversal from a given source

        // Using [STACK]

        /* source_Node = 2 , True=T  Visited_Nodes = Array

        step 1) 2 -->(Connected Nodes) 0,3
                       2  0  3
        Visited_Nodes[T][T][T][]
        queue[~2][0][3][]
        pop[2]

        [Last-In-First-Out Pop Elements]

        step 2)source_Node = 3 -->(Connected Nodes) 3
                       2  0  3
        Visited_Nodes[T][T][T][]
        queue[~2][0][~3][1]
        pop[2,3]

        step 3)source_Node = 0 -->(Connected Nodes) 1,2
                      2  0  3  1
        Visited_Nodes[T][T][T][T]
        queue[~2][~0][~3][1]
        pop[2,3,0]

        step 4)source_Node = 1 -->(Connected Nodes) 2
                      2  0  3  1
        Visited_Nodes[T][T][T][T]
        queue[~2][~0][~3][~1]
        pop[2,3,0,1]

                                            2  0  3  1
	     --> 0 --> 1          Visited_Nodes[T][T][T][T]
        /    |   /
        \    | //             queue[~2][~0][~3][~1]
         --- 2 --> 3 -->|
                   \<--/      In LIFO Order Pop Elements

                              s.pop[2,3,0,1]
	    */

        public void DFS(int source_Node){

            // Create an Array of Visited_Nodes & is size is V(No.of vertices)
            boolean Visited_Nodes[]=new boolean[V];

            // Create a Stack for DFS

            Stack<Integer> q=new Stack<>();

            // Mark the current node as visited and add(push) it.

            Visited_Nodes[source_Node]=true;
            q.add(source_Node);

            while(!q.isEmpty()){

                // Pop a vertex(Node)from Stack and print it.
                // Follow [LIFO] Order

                source_Node=q.pop();
                System.out.print(source_Node+" ");

                // Find Connected(Adj)Node of source Node

                for(int i:adj[source_Node]){

                    // If a adjacent has not been visited,
                    // then mark it visited and add(push) it

                    if(!Visited_Nodes[i]){
                        Visited_Nodes[i]=true;
                        q.add(i);
                    }
                }
            }

        }

    }

    public static void main(String[] args) {

        Graph g=new Graph(4);

		/*
		      --> 0 --> 1
             |    |   /
             \    | /
              --- 2 --> 3 -->|
                         \<--/
	    */

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("source Node = 2");

        g.DFS(2);

    }
}
