package DSA_COURSE_PLAYLIST;


// AVL Tree --> And its Operations

class Node05{
    int data,Height;
    Node05 left;
    Node05 Right;

    Node05(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
        Height=1;
    }
}

public class _27_AVL_TREE_OPERATIONS {

    static class AVL_Tree{

        Node05 Root;

        // A utility function to get maximum of two integers

        public int max(int a,int b){
            return (a>b) ? a : b;
        }

        // A utility function to get the height of the tree

        public int getHeight(Node05 n){
            if(n==null){
                return 0;
            }
            return n.Height;
        }

        // Get Balance factor of Node05 n       //     20  <- Balance factor is 0                                                                                           
        //    /  \                           
        public int getBalanceFactor(Node05 n){  //   10   40  subtree                      
            if(n==null){                  // [height of left - height of Right]                                         
                return 0;
            }
            return getHeight(n.left) - getHeight(n.Right);
        }

        // [Right_Rotation] ->
        // A utility function to Right rotate subtree rooted with y
        // See the diagram given above.
        
        /*
                y                            x
               / \     Right Rotation       / \
              x   T3   - - - - - - - >    T1   y 
             / \                              / \
            T1  T2                          T2  T3
      
        */

        public Node05 Right_Rotation(Node05 y){
            Node05 x=y.left;
            Node05 T2=x.Right;

            // Perform rotation

            x.Right=y;
            y.left=T2;

            // Update Height (After Rotation x & y Height will be change) 

            y.Height=max(getHeight(y.left),getHeight(y.Right))+1;        
            
            /* Take Max Height    x
                                 / \         
               [Height y.left]  T1  y  -> [Height y.Right subtree]
                    [1]            / \          [1] 
                                 T2   T3
            */

            x.Height=max(getHeight(x.left),getHeight(x.Right))+1;        
            
            /* Take Max Height     x
                                  / \         
               [Height x.left]  T1   y  [Height x.Right subtree]
                    [1]             / \          [2] 
                                   T2  T3
            */

            return x;   // Because x is Now Root of Tree 
        }

        // [Left_Rotation] ->
        // A utility function to Left rotate subtree rooted with x
        // See the diagram given above.
        
        /*
                x                            y
               / \     left  Rotation       / \
              T1  y    - - - - - - - >     x   T3
                 / \                      / \
               T2   T3                   T1  T2  
      
        */

        public Node05 Left_Rotation(Node05 x){
            Node05 y=x.Right;
            Node05 T2=y.left;

            // Perform rotation

            y.left=x;
            x.Right=T2;

            // Update Height (After Rotation x & y Height will be change) 

            y.Height=max(getHeight(y.left),getHeight(y.Right))+1;        
            
            /* Take Max Height    y
                                 / \         
               [Height y.left]  x   T3  -> [Height y.Right subtree]
                    [2]        / \              [1] 
                              T1 T2   
            */

            x.Height=max(getHeight(x.left),getHeight(x.Right))+1;        
            
            /* Take Max Height     y
                                  / \         
               [Height x.left]   x   T3  [Height x.Right subtree]
                    [1]         / \              [1] 
                              T1  T2  
            */

            return y;   // Because y is Now Root of Tree 
        }

        // Call by Insert_Rec function 

        public void Insert(int key){
            Root=Insert_Rec(Root,key);
        }

        // Insert function 

        public Node05 Insert_Rec(Node05 Root,int key){

            // 1) Perform the normal BST insertion 

            if(Root==null){
                Root=new Node05(key);
                return Root;
            }
            if(key<Root.data){
                Root.left=Insert_Rec(Root.left,key);
            }
            else if(key>Root.data){
                Root.Right=Insert_Rec(Root.Right,key);
            }

            // Duplicate keys not allowed

            else{
                return Root;
            }

            // 2) Update height of this ancestor Node05

            Root.Height=1+max(getHeight(Root.left),getHeight(Root.Right));
            
            /* 3) Get the balance factor of this ancestor Node05
                  to check whether this Node05 became unbalanced */

            int BF=getBalanceFactor(Root);

            // If this Node05 becomes unbalanced, then there are 4 cases
            // Left Left Case

            if(BF>1 && key<Root.left.data){
               
               /* Root.Left-> y     if(Bf>1) Max.Node05 in left subtree
                             / \    (key<Root.Left.data)
                            x   T3  then Go to the Left subtree.           
                           / \      
                         T1  T2     
            */

                return Right_Rotation(Root);
            }

            // Right Right Case 

            if(BF<-1 && key>Root.Right.data){
               
               /* Root.Right  x      if(Bf<-1) Max.Node05 in Right subtree
                             / \     (key>Root.Right.data)
                            T1  y    then Go to the Right subtree.           
                               / \                
                             T2   T3    
            */

                return Left_Rotation(Root);
            }

            // Left Right Case 

            if(BF>1 && key>Root.left.data){
               
               /*             y     if(Bf>1) Max.Node05 in left subtree
                           L / \    then Go to the Left subtree.
                Root.left.->x   T3  (key>Root.Left.data)           
                   data    / \ R    Insert key on Right side of Tree 
                         T1  T2  <- key.
            */

                // 1st Rotate left 
                Root.left=Left_Rotation(Root.left);
                return Right_Rotation(Root);
            }

            // Right left Case 

            if(BF<-1 && key<Root.Right.data){
               
               /* Root.Right  x      if(Bf<-1) Max.Node05 in Right subtree
                             / \     then Go to the Right subtree.                        
                            T1  y    (key<Root.Right.data)
                               / \   Insert key on left side of Tree 
                             T2   T3    
            */

                // 1st Rotate Right 
                Root.Right=Right_Rotation(Root.Right);
                return Left_Rotation(Root);
            }

            // return the (unchanged) Node05 pointer 

            return Root;
        }

        // Pre-Order Traversal 
        // The function also prints height of every Node05 

        public void PreOrder(Node05 n){
            if(n!=null){
                System.out.print(n.data+" ");
                PreOrder(n.left);
                PreOrder(n.Right);
            }
        }
    }
    public static void main(String[] args) {

        AVL_Tree tree=new AVL_Tree();


        tree.Insert(10);
        tree.Insert(20);
        tree.Insert(30);
        tree.Insert(40);
        tree.Insert(50);
        tree.Insert(25);
		
		/*
		
		tree.Root=tree.Insert_Rec(tree.Root,10);
		tree.Root=tree.Insert_Rec(tree.Root,20);
		tree.Root=tree.Insert_Rec(tree.Root,30);
		tree.Root=tree.Insert_Rec(tree.Root,40);
		tree.Root=tree.Insert_Rec(tree.Root,50);
		tree.Root=tree.Insert_Rec(tree.Root,25);

	    */
	    	
		/* The constructed AVL Tree would be 
    
                   30
                  /  \
                20    40
               /  \    \
             10    25   50

        */

        System.out.print("Pre-Order Traversal = ");
        tree.PreOrder(tree.Root);
    }
}
