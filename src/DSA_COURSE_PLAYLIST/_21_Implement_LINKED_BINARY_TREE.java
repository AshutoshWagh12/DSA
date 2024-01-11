package DSA_COURSE_PLAYLIST;


// implementation [Linked]->[BINARY TREE]

class Node{
    int data;     //   {[left][data][Right]}
    Node left;
    Node Right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}

public class _21_Implement_LINKED_BINARY_TREE {

    static class BinaryTree{

        Node Root;

        // In-Order Traversal [left-Root-Right]

        public void InOrder(Node n){
            if(n!=null){
                // 1st Recursion on left child
                InOrder(n.left);
                // Then print the data of Node
                System.out.print(n.data+" ");
                // Now Recursion on Right child
                InOrder(n.Right);
            }
        }

        // Pre-Order Traversal [Root-left-Right]

        public void PreOrder(Node n){
            if(n!=null){
                System.out.print(n.data+" ");
                PreOrder(n.left);
                PreOrder(n.Right);
            }
        }

        // Post-Order Traversal [left-Right-Root]

        public void PostOrder(Node n){
            if(n!=null){
                PostOrder(n.left);
                PostOrder(n.Right);
                System.out.print(n.data+" ");
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        // Creating Nodes Of Tree

        tree.Root=new Node(1);    // Create Root of Tree [null][1][null]
        tree.Root.left=new Node(2); // create left children[2] of Root [1]
        tree.Root.Right=new Node(4); // create Right children[4] of Root [1]
        tree.Root.left.left=new Node(20); // [20] becomes left child of [2]
        tree.Root.left.Right=new Node(40);
        tree.Root.Right.Right=new Node(100);

        System.out.print("In-Order BinaryTree = ");
        tree.InOrder(tree.Root);

        System.out.print("\nPre-Order BinaryTree = ");
        tree.PreOrder(tree.Root);

        System.out.print("\nPost-Order BinaryTree = ");
        tree.PostOrder(tree.Root);



    }

}
