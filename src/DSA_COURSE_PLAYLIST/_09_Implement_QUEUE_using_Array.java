package DSA_COURSE_PLAYLIST;

public class _09_Implement_QUEUE_using_Array {

    // Implementing Queue Using an ARRAY

    static class Queue{
        int size=4;
        int F=-1,R=-1;     // Start Front(First) at 0 and Rear(Last) at -1
        int arr[]=new int[size];

        // Insert(enqueue) Elements at Rear(R)-> Follow [FIFO] First In First Out

        void enqueue(int value){
            if(R==(size-1)){      // Queue is Full / OverFlow
                System.out.println("Queue OverFlow !!!");
            }
            else{                 // Queue is Not Full / OverFlow
                if(F==-1 && R==-1){  // Queue is Empty
                    F=0;             // Front & Rear goes on 0th index
                    R=0;
                    arr[R]=value;
                }
                else{
                    R++;              // increase Rear(R) and Insert Elements at Rear(Last)
                    arr[R]=value;     // Store Elements(value) in Rear(R).
                    // System.out.println(value+" enqueue from stack !!");
                }
            }
        }

        // Delete(Dequeue) Elements at Front(F)-> Follow [FIFO] First In First Out

        int Dequeue(){
            if(F == R){     // If Front(F) == Rear(R) OR [ F == -1 && R == -1 ]
                System.out.println("Queue UnderFlow !!!");  // Queue is Empty / UnderFlow.
                return 1;
            }
            else{                 // Queue is Not Empty / UnderFlow.
                int value=arr[F]; // First(F) Element in array is store in value.
                F++;              // increase Front(F) Skip [0] index Element.
                return value;     // return [0] index Element.
            }

        }

        // Displaying Elements Front(F) to Rear(R)

        void display(){
            for(int i=F;i<=R;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {

        Queue q=new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("The Elements in Queue is :");
        q.display();

        System.out.println();
        System.out.println(q.Dequeue()+" Dequeue from Queue !!");

        System.out.println(q.Dequeue()+" Dequeue from Queue !!");

        System.out.println("After the Elements in Queue is :");
        q.display();

    }

}
