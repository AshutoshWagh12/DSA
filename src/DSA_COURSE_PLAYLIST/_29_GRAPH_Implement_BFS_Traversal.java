package DSA_COURSE_PLAYLIST;


// Java program to print BFS traversal from a given source vertex.
// BFS(int source_Node) traverses vertices reachable from source_Node.


/*
    Source Vertex(S) ->   0---1
                          |   |
                          3---2
    Adjecency Array
         ||

        [0] -->[1]-->[3]    <-- List
        [1] -->[0]-->[2]
        [2] -->[1]-->[3]
        [3] -->[0]-->[2]
*/


import java.util.*;

public class _29_GRAPH_Implement_BFS_Traversal {

    static class Graph{

        private int V;    // No.of vertices eg:- 0,1,2,3
        private LinkedList<Integer>adj[];  // Adjecency List

        // Constructor

        Graph(int v){    // No.of vertices eg:- 0,1,2,3
            V=v;
            adj=new LinkedList[v];  // Create an Object of LinkedList

            // Create an Array of no.of vertices.
            // Each and Individual Elements in this Array Connected with LinkedList.
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<Integer>();
            }
        }

        // Function to add an edge Bet.2 Vertexs into the graph

    /*
                  s   d   { s - Source & d - Destination }

                  0---1
                  |   |
                  3---2

        [0] -->[1]-->[3]    <-- List
        [1] -->[0]-->[2]
        [2] -->[1]-->[3]
        [3] -->[0]-->[2]
    */

        public void addEdge(int s,int d){
            adj[s].add(d);     //  [0] --> [1]
        }

        // prints BFS traversal from a given source

    /*	 source_Node = 2 , True=T  Visited_Nodes = Array

         step 1) 2 -->(Connected Nodes) 0,3
                       2  0  3
         Visited_Nodes[T][T][T][]
         queue[~2][0][3][]
         pop[2]

         step 2)source_Node = 0 -->(Connected Nodes) 3,2
                       2  0  3  1
         Visited_Nodes[T][T][T][T]
         queue[~2][~0][3][1]
         pop[2,0]

        step 3)source_Node = 3,1 -->(Connected Nodes) 1,2
                       2  0  3  1
         Visited_Nodes[T][T][T][T]
         queue[~2][~0][~3][~1]
         pop[2,0,3,1]

                                          2  0  3  1
		--> 0 --> 1         Visited_Nodes[T][T][T][T]
       /    |   /
       \    | //            queue[2][0][3][1]
        --- 2 --> 3 -->|
                  \<--/     poll[2,0,3,1]
	*/

        public void BFS(int source_Node){

            // Create an Array of Visited_Nodes & is size is V(No.of vertices)

            boolean Visited_Node[]=new boolean[V];

            // Create a queue for BFS Using LinkedList

            Queue<Integer> q =new LinkedList<>();

            // Mark the current node as visited and enqueue it
            Visited_Node[source_Node]=true;
            q.add(source_Node);

            while(!q.isEmpty()){

                // Dequeue a vertex(Node)from queue and print it.

                source_Node=q.poll();
                System.out.print(source_Node+" ");

                // Find Connected(Adj)Node of source Node

                for(int i:adj[source_Node]){

                    // If a adjacent has not been visited,
                    // then mark it visited and enqueue it

                    if(!Visited_Node[i]){
                        Visited_Node[i]=true;
                        q.add(i);
                    }
                }
            }

        }

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

        System.out.println("BFS ->source Node = 2");

        g.BFS(2);

        System.out.println();
        System.out.println("DFS ->source Node = 2");

        g.DFS(2);

    /*     --------------- OR ---------------

    	Graph g=new Graph(7);

		g.addEdge(0,1);       //      0 ---> 1
		g.addEdge(1,2);       //      ^      |
		g.addEdge(2,3);       //      |      +
		g.addEdge(2,4);       //      3 <--- 2
		g.addEdge(3,0);       //      \     /
		g.addEdge(3,4);       //       +   /
		g.addEdge(4,2);       //         4
		g.addEdge(4,5);       //        / \
		g.addEdge(4,6);       //       +   \
		g.addEdge(5,6);       //      5 --> 6
		g.addEdge(6,4);       //

		System.out.println("BFS Source Node = 4");
		g.BFS(4);

		System.out.println();

		System.out.println("DFS Source Node = 4");
		g.DFS(4);

    */

    }
}
