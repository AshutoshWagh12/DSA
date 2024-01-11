package DSA_COURSE_PLAYLIST;


import java.util.Scanner;

class Node00{
    int data;
    Node00 left;
    Node00 Right;

    Node00(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}

public class _22_Implement_BINARY_TREE_User_Input {

    static Node00 Create(){
        int data;
        Node00 Root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value :");
        data=sc.nextInt();

        if(data==-1){
            return null;
        }
        else{
            Root=new Node00(data);
            System.out.println("Enter the left child of : "+data);
            Root.left=Create();
            System.out.println("Enter the Right child of : "+data);
            Root.Right=Create();
            return Root;
        }

    }

    // In-Order Traversal

    public static void InOrder(Node00 n){
        if(n!=null){
            InOrder(n.left);
            System.out.print(n.data+" ");
            InOrder(n.Right);
        }
    }


    // Pre-Order Traversal

    public static void PreOrder(Node00 n){
        if(n!=null){
            System.out.print(n.data+" ");
            PreOrder(n.left);
            PreOrder(n.Right);
        }
    }

    // Post-Order Traversal

    public static void PostOrder(Node00 n){
        if(n!=null){
            PostOrder(n.left);
            PostOrder(n.Right);
            System.out.print(n.data+" ");
        }
    }

    public static void main(String[] args) {

        Node00 Root=Create();

        System.out.print("In-Order Traversal = ");
        InOrder(Root);

        System.out.print("\nPre-Order Traversal = ");
        PreOrder(Root);

        System.out.print("\nPost-Order Traversal = ");
        PostOrder(Root);

    }
}
