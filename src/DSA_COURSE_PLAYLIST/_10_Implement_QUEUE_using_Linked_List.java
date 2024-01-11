package DSA_COURSE_PLAYLIST;

public class _10_Implement_QUEUE_using_Linked_List {

    // implementation Queue Using Linked List

    static class Queue{

        Node F=null;
        Node R=null;

        class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        // Insertion(Enqueue) Elements at Rear End Function

        public void Enqueue(int data){
            Node New_node=new Node(data);

            if(New_node==null){   // Queue is Full / OverFlow
                System.out.println("Stack OverFlow !!");
            }
            else{                 // Queue is Not Full // OverFlow
                if(F==null){      // If Queue is Empty means Front(F) is null && Rear(R) is null
                    F=New_node;   // then you connect Front(F) & Rear(R) to New_node.
                    R=New_node;
                }
                else{
                    R.next=New_node;   // Insertion at Rear(last)End
                    R=New_node;        // Rear(R) is (Go On)point to New_node
                }
            }
        }

        // Deletion(Dequeue) Elements at Front End Function

        public int Dequeue(){
            if(F==null){         // Queue is Empty
                System.out.println("Queue UnderFlow !!");
                return 1;
            }
            else{                  // Queue is NOT Empty
                int data=F.data;   // Store First(F.data) Element in data
                F=F.next;          // Deleting First Element in Linked List
                return data;       // return First Elements in Linked List
            }
        }

        // Displaying Elements in Queue Function

        public void display(){
            Node ptr=F;         // create poiter ptr is point to Front(F)
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
        }
    }

    public static void main(String[] args) {

        Queue L=new Queue();

        L.Enqueue(10);
        L.Enqueue(20);
        L.Enqueue(30);
        L.Enqueue(40);

        System.out.println("The Elements in Queue is :");
        L.display();

        System.out.println();
        System.out.println(L.Dequeue()+" Dequeue from Queue !!");

        System.out.println("After the Elements in Queue is :");
        L.display();


    }

}
