package DSA_COURSE_PLAYLIST;


// Implementation stack using Linked list

class stack{

    Node Top=null;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // Push the Element at Begining

    void push(int data){
        Node New_node=new Node(data);

        if(Top==null){
            Top=New_node;
        }
        else{
            New_node.next=Top;   // Insert/push the Element in Stack Begining
            Top=New_node;
        }
    }

    // Pop the Element at Begining

    void pop(){
        if(Top==null){     // Stack is Empty/ UnderFlow
            System.out.println("Stack is Empty !!!");
        }
        else{
            Top=Top.next;   // Deleting the 1st Element in stack
        }
    }

    // Create peek function

    int peek(int position){    //  position    (n)time travel(ptr)<-Top
        Node ptr=Top;          //     1          0 (Top is point on 0 index)
        //     2          1
        for(int i=0;(i<position-1&&ptr!=null);i++){
            ptr=ptr.next;
        }                      //     3          2
        if(ptr!=null){
            return ptr.data;
        }
        else{
            return -1;
        }
    }

    // Displaying the Element in stack

    void display(){
        Node ptr=Top;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
}
public class _05_Implement_STACK_using_Linked_List {

    public static void main(String[] args) {

        stack s=new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("The Elements in stack is :");
        s.display();

        System.out.println();

        for(int i=1;i<=4;i++){
            System.out.println("The position at "+i+" value is "+s.peek(i));
        }

        s.pop();

        System.out.println("\nAfter the Elements in stack is :");
        s.display();

    }

}
