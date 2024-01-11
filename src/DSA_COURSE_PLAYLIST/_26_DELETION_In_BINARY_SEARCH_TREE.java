package DSA_COURSE_PLAYLIST;


//    [DELETION] - In Binary Search Tree

class Node04{
    int data;
    Node04 left;
    Node04 Right;

    Node04(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}
public class _26_DELETION_In_BINARY_SEARCH_TREE {

    static class Binary_S_Tree{
        Node04 Root;

        // Find the InOrderPredecessor of Given Node04 function

        public Node04 InOrderPredecessor(Node04 Root){
            Root=Root.left;
            while(Root.Right!=null){
                Root=Root.Right;
            }
            return Root;
        }

        // This method mainly calls Delete_Rec()

        public void Delete(int value){
            Root=Delete_Rec(Root,value);
        }

        // A recursive function to delete an existing key in BST

        public Node04 Delete_Rec(Node04 Root,int value){
            Node04 Ipre;
            if(Root==null){
                return null;
            }

            // Search For the Node04 to be Deleted

            if(value<Root.data){
                Root.left=Delete_Rec(Root.left,value);
            }
            else if(value>Root.data){
                Root.Right=Delete_Rec(Root.Right,value);
            }

            // Deletion Stratergy When the Node04 is Found 

            else{

                // Node04 with only one child or no child.  

                if(Root.left==null){
                    return Root.Right;
                }                       
                /*     10                                      10
                      /  \                                    /  \
                     6    20                                 6   40
                        /  \     delete[20] --->                /  \
                    null    40  [40 Goes on Root position]  null   null
                
                */

                else if(Root.Right==null){
                    return Root.left;
                }                          
                /*     10                                       10
                      /  \                                     /  \
                     6    20                                  6   40
                        /  \     delete[20] --->                /  \
                      40   null  [40 Goes on Root position]  null   null
                
                */

                Ipre=InOrderPredecessor(Root);
                Root.data=Ipre.data;

                // Delete the inorder Predecessor

                Root.left=Delete_Rec(Root.left,Ipre.data); 
                
                
                /*      10      inorder[2 6 8 10 20].            10
                       /  \     {In-prece[6]=Ipre=2}.           /  \
                Root->6    20  Copy Ipre(previous data)        2   40
                     / \             on Root.data.            / \
              Ipre->2   8       Delete Ipre data[2].      null   8
                
                */
            }
            return Root;
        }

        public void InOrder(Node04 n){
            if(n!=null){
                InOrder(n.left);
                System.out.print(n.data+" ");
                InOrder(n.Right);
            }
        }

    }

    public static void main(String[] args) {

        Binary_S_Tree tree=new Binary_S_Tree();

        tree.Root=new Node04(10);
        tree.Root.left=new Node04(6);
        tree.Root.Right=new Node04(20);
        tree.Root.left.left=new Node04(2);
        tree.Root.left.Right=new Node04(8);
        tree.Root.Right.Right=new Node04(40);


        System.out.print("In-order Traversal = ");
        tree.InOrder(tree.Root);

        tree.Delete(40);

        System.out.println();
        System.out.print("In-order Traversal = ");
        tree.InOrder(tree.Root);


    }
}
