package DSA_COURSE_PLAYLIST;

public class _02_CircularLinkedListOperations {

    Node Head;    // Head of List

    class Node{
        int data;
        Node next;

        // Constructor to create a New Node

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // [INSERTION]:-

    // CASE 1 :- Insertion at Begining in Circular Linked list

    public void addFirst(int data){
        Node New_node=new Node(data);  // Create a Node with given data

        Node p=Head;         // Create a Pointer p is equal to the Head(1st Node)

        if(Head==null){      // List is Empty (Head is Point itself)
            Head=New_node;
            New_node.next=Head;
        }
        else{                // List is Already Exist
            while(p.next!=Head){   // Pointer p is Travel upto is Not equal to Head.
                p=p.next;    // Go to the last Node.
            }
            New_node.next=Head;   // insert New Node at Begining
            Head=New_node;
            p.next=New_node; // p is go in last Node of list and point to (1st) New Node
        }
    }

    // CASE 2 :- Insertion at given Index in Circular Linked list

    public void insertAtIndex(int index,int data){
        Node New_node=new Node(data);     // Create a Node with given data

        Node p=Head;   // create pointer p is equal to the Head(1st Node)

        for(int i=0;i<index-1;i++){   // p is Travel upto index-1
            p=p.next;
        }
        New_node.next=p.next;   // Insert element at given index
        p.next=New_node;
    }

    // CASE 3 :- Insertion at After Node

    public void insertAfterNode(int value,int data){
        Node New_node=new Node(data);   // Create a Node with given data

        Node p=Head;    // Create pointer p is equal to the Head

        while(p.data!=value && p.next!=Head){  // p is Travel upto
            p=p.next;         // p data(New_node) is Not equal to value and Head
        }
        if(p.data==value){
            New_node.next=p.next;  // insert the data after the value(Node)
            p.next=New_node;
        }

    }

    // CASE 4 :- Insertion at Before Node

    public void insertBeforeValue(int value,int data){
        Node New_node=new Node(data);

        Node p=Head;
        Node q=Head.next;

        while(q.data!=value && q.next!=Head){
            p=p.next;
            q=q.next;
        }
        if(q.data==value){
            New_node.next=q;
            p.next=New_node;
        }
    }

    // CASE 5 :- Insertion at End in Circular Linked list

    public void addEnd(int data){
        Node New_node=new Node(data);  // create a Node with given data

        Node last=Head;   // Create pointer last is equal to the Head

        if(Head==null){   // List is Empty (Head is Point itself)
            Head=New_node;
            New_node.next=Head; // New_node is Back to the point to Head
        }
        else{             // List is Already Exist
            while(last.next!=Head){ // pointer last is Travel upto Not equal to Head.
                last=last.next;     // Go to last Node
            }
            last.next=New_node;     // insert New Node in Circular [LL]
            New_node.next=Head;     // New_node is Back to the point to Head
        }

    }

    // [DELETION]:- Circular Linked list

    // CASE 1 :- Deletion at Begining in Circular Linked list

    public void delFirst(){
        Node p=Head;    // Create Pointer p is equal to Head(1st Node)

        while(p.next!=Head){    // p is Travel upto p is not equal to Head
            p=p.next;           // Go to the last Node
        }
        Head=Head.next;     // Deleting the 1st Node of list.Head is point to 2nd Node
        p.next=Head;        // last node of list is point to New Head of list(2nd Node)
    }

    // CASE 2 :- Deletion at given Index in Circular Linked list

    public void delAtIndex(int index){
        Node p=Head;    // Create Pointer p is equal to Head(1st Node)
        Node q=Head.next;  // Create Pointer q is equal to 2nd node of list

        for(int i=0;i<index-1;i++){  // p and q is Travel upto index-1 in list
            p=p.next;          // Go to the 2nd last Node of given index(last Node)
            q=q.next;          // Go to the given index(last Node)
        }
        p.next=q.next;   // Deleting the Node at given index
    }

    // CASE 3 :- Deletion at given value in Circular Linked List

    public void delAtValue(int value){
        Node p=Head;        // Create p Pointer is equal to Head(1st Node)
        Node q=Head.next;   // Create q Pointer is equal to 2nd Node of list

        while(q.data!=value && q.next!=Head){  // p and q is Travel upto
            p=p.next;             // q.data is not equal to given value and Head
            q=q.next;
        }
        if(q.data==value){
            p.next=q.next;   // Deleting the node at given value
        }
    }

    // CASE 4 :- Deletion at End in Circular Linked list

    public void delEnd(){
        Node p=Head;    // Create Pointer p is equal to Head(1st Node)
        Node q=Head.next; // Create Pointer q is equal to 2nd Node of list

        while(q.next!=Head){  // q is Travel upto is Not equal to Head
            p=p.next;       // Go to the 2nd last Node
            q=q.next;        // Go to the last Node
        }
        p.next=Head;      // Deleting the last Node in list
    }

    // Traversal in Circular Linked List

    public void Traversal(){
        Node ptr=Head;    // Pointer ptr is point to every Node in list

        if(Head==null){
            System.out.println("List is Empty");
        }
        else{            // Circulat Linked list is Exist
            do{
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }while(ptr!=Head);
        }
    }

    public static void main(String[] args) {

        _02_CircularLinkedListOperations l=new _02_CircularLinkedListOperations();

        l.addEnd(10);
        l.addEnd(20);
        l.addEnd(30);
        l.addEnd(40);

        System.out.println("The Elements are :");
        l.Traversal();

        // [INSERTION FUNCTIONS] :->

        // l.addFirst(500);
        // l.insertAtIndex(2,600);
        // l.insertAfterNode(30,800);
        // l.insertBeforeValue(30,800);

        // [DELETION FUNCTIONS] :->

        // l.delFirst();
        // l.delAtIndex(2);
        // l.delAtValue(30);
        // l.delEnd();

        System.out.println("\nThe New Elements are :");
        l.Traversal();

    }

}
