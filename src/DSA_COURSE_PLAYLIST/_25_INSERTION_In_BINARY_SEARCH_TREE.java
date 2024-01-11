package DSA_COURSE_PLAYLIST;



// [INSERTION]-In Binary Search Tree

class Node03{
    int data;
    Node03 left;
    Node03 Right;

    Node03(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}
public class _25_INSERTION_In_BINARY_SEARCH_TREE {

    static class BinaryTree{
        Node03 Root;

        // This method mainly calls Insert_Rec(Root,key)


        public void Insert(int key){
            Root=Insert_Rec(Root,key);
        }

        // A recursive function to insert a new key in BST 

        public Node03 Insert_Rec(Node03 Root,int key){

            // If the tree is empty,return a new Node03 (Insert key at the null)

            if(Root==null){
                Root=new Node03(key);
                return Root;
            }

            // key is Equal to Root of data You Can not insert key in Tree 

            if(key==Root.data){
                System.out.println("\nCannot Insert "+key+" Already in BST ");
                return Root;
            }

            // Otherwise, Recursion down the tree 

            if(key<Root.data){
                Root.left=Insert_Rec(Root.left,key);
            }
            else{
                Root.Right=Insert_Rec(Root.Right,key);
            }

            // return the (unchanged) Node03 pointer

            return Root;
        }

        // In-Order Treversal 

        public void InOrder(Node03 n){
            if(n!=null){
                InOrder(n.left);
                System.out.print(n.data+" ");
                InOrder(n.Right);
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.Root=new Node03(10);
        tree.Root.left=new Node03(6);
        tree.Root.Right=new Node03(20);
        tree.Root.left.left=new Node03(2);
        tree.Root.left.Right=new Node03(8);
        tree.Root.Right.Right=new Node03(30);

        System.out.print("In-Order Treversal = ");
        tree.InOrder(tree.Root);

        tree.Insert(1);

        System.out.print("\nIn-Order Treversal = ");
        tree.InOrder(tree.Root);


    }
}
