package DSA_COURSE_PLAYLIST;

public class _03_DoublyLinkedListOperations {

    Node Head;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    // [INSERTION IN DOUBLY LINKED LIST]:->

    // CASE 1:- Insertion at Begining

    public void addFirst(int data){
        Node New_node=new Node(data);

        if(Head==null){
            New_node.prev=null;
            Head=New_node;
            //   New_node.prev=null;
        }
        else{
            Head.prev=New_node;
            New_node.next=Head;
            Head=New_node;
        }
    }

    // CASE 2 :- Insertion at given Index in circular Linked list

    public void insertAtIndex(int index,int data){
        Node New_node=new Node(data);

        Node p=Head;

        for(int i=0;i<index-1;i++){
            p=p.next;
        }
        New_node.next=p.next;  // Insert at given Index
        p.prev=New_node;
        p.next=New_node;
        New_node.prev=p;
    }

    // CASE 3 :- Insertion at after Node

    public void insertAfterNode(int value,int data){
        Node New_node=new Node(data);

        Node p=Head;

        while(p.data!=value && p.next!=null){
            p=p.next;
        }
        if(p.data==value){
            New_node.next=p.next;
            p.prev=New_node;
            p.next=New_node;
            New_node.prev=p;
        }
    }

    // CASE 4 :- Insertion at Before Node

    public void insertBeforeNode(int value,int data){
        Node New_node=new Node(data);

        Node p=Head;
        Node q=Head.next;

        while(q.data!=value && q.next!=null){
            p=p.next;
            q=q.next;
        }
        if(q.data==value){
            New_node.next=q;
            q.prev=New_node;
            p.next=New_node;
            New_node.prev=p;
        }
    }

    // CASE 5 :- Insertion at End

    public void addEnd(int data){
        Node New_node=new Node(data);  // Create a Node with given data

        Node last=Head;    // Create pointer last is equal to Head(1st Node)

        if(Head==null){    // list is Empty !!!
            Head=New_node;
            New_node.prev=null;
        }
        else{              //  list is Already Exist
            while(last.next!=null){  // Pointer last is Travel upto != null
                last=last.next;    // Go to the last Node of list
            }
            last.next=New_node;  // Insert Node in last of list
            New_node.prev=last;
            New_node.next=null;
        }

    }

    // [DELETION] :-> Doubly Linked list

    // CASE 1 :- Deletion at Begining

    public void delFirst(){
        Head.prev=null;
        Head=Head.next;
        //    Head.prev=null;
    }

    // CASE 2 :- Deletion at given Index

    public void delAtIndex(int index){
        Node p=Head;
        Node q=Head.next;

        for(int i=0;i<index-1;i++){
            p=p.next;
            q=q.next;
        }
        p.next=q.next;   // Delete Node at given index
        q.prev=p.next;
    }

    // CASE 3 :- Deletion at given Value

    public void delAtValue(int value){
        Node p=Head;
        Node q=Head.next;

        while(q.data!=value && q.next!=null){
            p=p.next;
            q=q.next;
        }
        if(q.data==value){
            p.next=q.next;   // Delete Node at given value
            q.prev=p.next;
        }
    }

    // CASE 4 :- Deletion at End

    public void delEnd(){
        Node p=Head;
        Node q=Head.next;
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        p.next=null;

    }

    // Traversal in Doubly Linked list

    public void Traversal(){
        Node ptr=Head;    // create Pointer ptr is point to every Node of list

        if(Head==null){
            System.out.println("List is Empty !!!");
        }
        else{
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;

            }

        }
    }

    // Reverse Travel in Doubly Linked list

    public void reverse(){
        Node ptr=Head;

        while(ptr.next!=null){
            ptr=ptr.next;
        }
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.prev;
        }
    }

    public static void main(String[] args) {

        _03_DoublyLinkedListOperations l=new _03_DoublyLinkedListOperations();

        l.addEnd(10);
        l.addEnd(20);
        l.addEnd(30);
        l.addEnd(40);

        System.out.println("The Elements are :");
        l.Traversal();

        // [INSERTION FUNCTIONS]:->

        // l.addFirst(500);
        // l.insertAtIndex(2,500);
        // l.insertAfterNode(20,600);
        l.insertBeforeNode(20,600);

        // [DELETION FUNCTIONS]:->

        // l.delFirst();
        // l.delAtIndex(2);
        // l.delAtValue(30);
        // l.delEnd();

        System.out.println("\nThe New Elements are :");
        l.Traversal();
        // l.reverse();
    }

}
