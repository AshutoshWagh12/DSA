package DSA_COURSE_PLAYLIST;

public class _01_SinglyLinkedListOperations {

    Node Head;      // Head of List     [int][next(pointer)]
    class Node{     // create a Node    [10][.]
        int data;
        Node next;

        Node(int data){   //  Constructor to create a New Node
            this.data=data;
            this.next=null;  // Next-> is by default initialize as Zero(0)
        }
    }

    // [INSERTION] :- Singly linked list

    // CASE 1 -> insert element at Begining

    public void addFirst(int data){
        Node New_node=new Node(data);  // create a Node with given data
        if(Head==null){             // List is Empty !!
            Head=New_node;          // Stored 1st element in Head
        }
        else{                       // List is Already Exist -->(If ststement set 1st value)
            New_node.next=Head;     // insert element at Begining
            Head=New_node;
        }
    }

    // CASE 2 -> insert element at given index

    public void insertAtIndex(int data,int index){
        Node New_node=new Node(data);   // Create a Node with given data

        Node p=Head;                    // Create a Pointer(Node) P is equal to Head

        for(int i=0;i<index-1;i++){     // Pointer(Node) P is Travel upto index-1
            p=p.next;                   // Go to the next Node
        }
        New_node.next=p.next;           // insert data in given Index
        p.next=New_node;
    }

    // CASE 3 -> insert element at End

    public void addEnd(int data){
        Node New_node=new Node(data);  // Create a Node with given data

        Node last=Head;                // Create a Pointer last is equal to Head

        if(Head==null){                // list is Empty
            Head=New_node;             // Stored 1st element in Head
        }
        else{                          // List is Already Exist (If ststement)
            while(last.next!=null){    // last Node is Travel uoto Last.next!=null
                last=last.next;        // Go to the next Node
            }
            last.next=New_node;        // insert element at the last Node
            New_node.next=null;
        }
    }

    // CASE 4 -> insert element at given data/key/value after Node

    public void insertAfterValue(int value,int data){
        Node New_node=new Node(data);     // Create a Node with given data

        Node p=Head;                    // Create Pointer(Node) P is equal to Head

        while(p.data!=value && p.next!=null){  // ( P is Travel upto p.data is Not equal
            p=p.next;                          // to given value and p.next is Not null )
        }
        // if p.data is equal to value insert the element after the Node
        if(p.data==value){
            New_node.next=p.next;
            p.next=New_node;
        }
    }

    // CASE 5 :- Insertion at Before Node

    public void insertBeforeValue(int value,int data){
        Node New_node=new Node(data);

        Node p=Head;
        Node q=Head.next;

        while(q.data!=value && q.next!=null){
            p=p.next;
            q=q.next;
        }
        if(q.data==value){
            New_node.next=q;
            p.next=New_node;
        }
    }

    // [DELETION] :--

    // CASE 1 -> Delete element at the Begining

    public void delFirst(){
        Head=Head.next;     // Deleting element at Begining.( Head is point to the next Node )
    }

    // CASE 2 -> Delete element at the given index

    public void delAtIndex(int index){
        Node p=Head;         //  Create pointer p is equal to Head(Point to Head element(1st ele.))
        Node q=Head.next;    // Create pointer q is equal to next element in list(Head.next).

        for(int i=0;i<index-1;i++){  // p and q is Travel upto index-1
            p=p.next;                // Go to the next Node
            q=q.next;                // GO to the next Node
        }
        p.next=q.next;         // Deleting the element at given Index
    }

    // CASE 3 -> Delete element at the Last

    public void delEnd(){
        Node p=Head;       // Create pointer p is equal to Head
        Node q=Head.next;  // Create pointer q is equal to Head.next element

        while(q.next!=null){  // p and q is travel upto q.next is not equal to NULL
            p=p.next;         // Go to the next Node
            q=q.next;         // Go to the next Node
        }
        p.next=null;          // Deleting element at the Last Node
    }

    // CASE 4 -> Delete element at the given Value

    public void delValue(int value){
        Node p=Head;      // Create pointer p is equal to Head
        Node q=Head.next; // Create pointer q is equal to Head.next element

        while(q.data!=value  && q.next!=null){  // (p and q is Travel upto q.data!=value
            p=p.next;                           // and q.next != null)
            q=q.next;
        }
        if(q.data==value){    // If p.data is equal to value deleting the given element
            p.next=q.next;
        }
    }

    // Traversal in linked list

    public void Traversal(){
        Node ptr=Head;      // Create ptr pointer to point every Node in list
        if(Head==null){     // List is Empty !!!
            System.out.println("List is Empty !!!");
        }
        else{
            while(ptr!=null){
                System.out.print(ptr.data+" ");  // Displaying the Elements in List
                ptr=ptr.next;
            }
        }
    }

    public static void main(String[] args) {
        // In Class Main All Methods is Non-Static Create an obj.of Main class.
        _01_SinglyLinkedListOperations l=new _01_SinglyLinkedListOperations();

        l.addEnd(10);
        l.addEnd(20);
        l.addEnd(30);
        l.addEnd(40);

        System.out.println("The Elements are :");
        l.Traversal();

        // [INSERTION FUNCTIONS] :-

         l.addFirst(500);
         l.insertAtIndex(600,2);
         l.insertAfterValue(30,800);
         l.insertBeforeValue(30,800);

        // [DELETION FUNCTIONS] :-

         l.delFirst();
         l.delAtIndex(2);
         l.delEnd();
         l.delValue(30);
        System.out.println("\nThe New Elements are :");
        l.Traversal();
    }
}
