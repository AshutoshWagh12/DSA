package DSA_COURSE_PLAYLIST;



class Node01{
    int data;
    Node01 left;
    Node01 Right;

    Node01(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}

public class _23_Check_Is_BINARY_SEARCH_TREE_Or_NOT {

    static class BinarySearchTree{
        Node01 Root;

        public void InOrder(Node01 n){
            if(n!=null){
                InOrder(n.left);
                System.out.print(n.data+" ");
                InOrder(n.Right);
            }
        }

        public boolean isBST(Node01 n){

            if(n!=null){

                // False if left is > than n(Root) [True;-left is < than Root]

                if(n.left!=null && n.left.data > n.data){
                    return false;
                }

                // False if right is < than n(Root) [True;-Right is > than Root]

                if(n.Right!=null && n.Right.data < n.data){  // 2,    4,   6, 7, 9
                    return false;
                }

                // False if, recursively, the left or right is not a BST


                if(!isBST(n.left) || !isBST(n.Right)){
                    return false;
                }
            }
            // Passing all that, it's a BST [n==null]


            return true;
        }
    }




    public static void main(String[] args) {

        BinarySearchTree tree=new BinarySearchTree();

        tree.Root=new Node01(10);
        tree.Root.left=new Node01(6);
        tree.Root.Right=new Node01(20);
        tree.Root.left.left=new Node01(12);
        tree.Root.left.Right=new Node01(8);

        System.out.print("InOrder Traversal = ");
        tree.InOrder(tree.Root);

        System.out.println();

        if(tree.isBST(tree.Root)){
            System.out.println(" Yes is Binary Search Tree");
        }
        else{
            System.out.println(" Is Not Binary Search Tree ");
        }

    }
}
