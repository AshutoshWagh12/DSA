package DSA_COURSE_PLAYLIST;

public class _11_Circular_QUEUE_In_QUEUE {

    // Circular_Queue in Queue

    static  class Circular_Queue{
        int size=4;
        int F=-1,R=-1;
        int arr[]=new int[size];


        // Enqueue in Circular_Queue

        void Enqueue(int value){
            if(((R+1)%size) == F){    // Circular Queue is Full // OverFlow
                System.out.println("Queue OverFlow !!");
            }
            else{               // Circular_Queue is Not Empty
                if(F==-1 && R==-1){
                    F=0;
                    R=0;
                    arr[R]=value;
                }
                else{
                    R=(R+1)%size;   // Increase Rear(R) in Circular_Queue order
                    arr[R]=value;   // Stored value in Rear.
                    // System.out.println(value+" Enqueue from Queue !!");
                }
            }
        }

        // Dequeue in Circular_Queue

        int Dequeue(){
            if(F==R){      // Queue is Empty / UnderFlow
                F=-1;
                R=-1;
                System.out.println("Queue UnderFlow !!");
                return -1;
            }
            else{                 // Circular_Queue is Not Empty
                int value=arr[F]; // Front(F) First Element in Queue store in value
                F=(F+1)%size;     // Increase Front(F) in Circular Order Delete First Element
                return value;

            }
        }

        // Displaying Elements Front to Rear Order

        void display(){
            int i;
            for(i=F;i!=R;i=(i+1)%size){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {

        Circular_Queue c=new Circular_Queue();

        c.Enqueue(10);
        c.Enqueue(20);
        c.Enqueue(30);
        c.Enqueue(40);

        System.out.println("The Elements in Queue is :");
        c.display();

        System.out.println();
        System.out.println(c.Dequeue()+" Dequeue from queue !!");
        System.out.println(c.Dequeue()+" Dequeue from queue !!");
        System.out.println(c.Dequeue()+" Dequeue from queue !!");

        c.Enqueue(100);
        c.Enqueue(300);
        c.Enqueue(500);

        System.out.println("After the Elements in Queue is :");
        c.display();

    }

}
