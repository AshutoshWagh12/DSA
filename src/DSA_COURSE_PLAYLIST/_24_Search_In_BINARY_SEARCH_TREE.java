package DSA_COURSE_PLAYLIST;


class Node02{
    int data;
    Node02 left;
    Node02 Right;

    Node02(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}
public class _24_Search_In_BINARY_SEARCH_TREE {

    static class BinaryTree{
        Node02 Root;

        public void InOrder(Node02 n){
            if(n!=null){
                InOrder(n.left);
                System.out.print(n.data+" ");
                InOrder(n.Right);
            }
        }

        // Recursive Approach :- A utility function to search a given key in BST
        
    /*    public Node02 Search(Node02 n,int key){
            if(n==null){
                return null;
            }
            
            // key is present at root(n)
            
            if(key==n.data){
                return n;
            }
            
            // Key is smaller than root(n) data 

            
            else if(key<n.data){
                return Search(n.left,key);
            }
            
            // Key is greater than root(n) data

            
            else{
                return Search(n.Right,key);
            }
        }  */

        // Iterative Approach -> Serching in Binary Search Tree

        public Node02 IterativeSearch(Node02 Root,int key){

            while(Root!=null){
                if(key==Root.data){
                    return Root;
                }
                else if(key<Root.data){
                    Root=Root.left;
                }
                else{
                    Root=Root.Right;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.Root=new Node02(10);
        tree.Root.left=new Node02(6);
        tree.Root.Right=new Node02(20);
        tree.Root.left.left=new Node02(2);
        tree.Root.left.Right=new Node02(8);
        tree.Root.Right.Right=new Node02(100);

        System.out.print("In-Order Treversal = ");
        tree.InOrder(tree.Root);

        System.out.println();

        // Recursive Approach :- 
	    
	    /*
		Node02 n=tree.Search(tree.Root,6);
		
		if(n!=null){
		    System.out.println("Found = "+n.data);
		}
		else{
		    System.out.println("Not Found Element !!"); 
		}  */

        // Iterative Approach -> Searching in Binary Search Tree

        Node02 n=tree.IterativeSearch(tree.Root,6);

        if(n!=null){
            System.out.println("Found = "+n.data);
        }
        else{
            System.out.println("Not Found Element !!");
        }

    }
    
}
