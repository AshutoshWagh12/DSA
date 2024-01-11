package DSA_COURSE_PLAYLIST;

public class _12_Double_Ended_QUEUE {

    // Implementation of DE-Queue(Double Ended) Using ->[Circular Queue]

    static class DEQueue{
        int size=4;
        int F=-1,R=-1;
        int arr[]=new int[size];

        // Insertion at The End(Rear) Using Circular Queue.

        public void Enqueue_Rear(int value){
            if(((R+1)%size)==F){     // Circular Queue is Full.
                System.out.println("DEQueue OverFull !!");
            }
            else{
                if(F==-1 && R==-1){  // if Circular Queue is Empty
                    F=0;             // Front(F) & Rear(R) is go on [0th] index
                    R=0;
                    arr[R]=value;    // Insest the value in Rear(R) ([0th] index).
                }
                else{
                    R=(R+1)%size;    // Increase the Rear(R)
                    arr[R]=value;    // & Insert the value in Rear(R).
                    // System.out.println(value+" Insert from DEQueue ");
                }
            }
        }

        // Insertion at Front(Begining) Using Circular Queue

        public void Enqueue_Front(int value){
            if(((R+1)%size)==F){
                System.out.println("DEQueue OverFull !!");
            }
            else if(F==-1 && R==-1){   // if Circular Queue is Empty
                F=0;                   // Front(F) & Rear(R) is go on [0th] index
                R=0;
                arr[F]=value;          // Insest the value in Front(F) ([0th] index).
            }
            else if(F==0){    // If Front f is on [0th] index means [0(ind)->10(value)]
                F=size-1;     // New value is Insest in Circular Queue of ((Size[4]-1)=[3]).
                arr[F]=value; // otherwise Front go on -1 index in Circular Queue.
            }
            else{
                F--;          // Decreasing the Front(F) .
                arr[F]=value; // Insert the value in Front(F).
            }
        }

        // Deletion at Front(Begining) in Circular Queue.

        public int DEQueue_Front(){
            if(F==R){
                System.out.println("DEQueueF Empty !!");
                return -1;
            }
            else{
                int value=arr[F];
                F=(F+1)%size;      // Increasing Front & Deleting Elements in Queue
                return value;
            }
        }

        // Deletion at Reat(End) in Circular Queue.

        public void DEQueue_Rear(){
            if(F==R){
                System.out.println("DEQueue is Empty !!");
            }
            else if(R==0){
                System.out.println(arr[R]+" delete from DEQueue :");
                R=size-1;
            }
            else{
                System.out.println(arr[R]+" delete from DEQueue :");
                R--;
            }
        }

        // Displaying Elements in DEQueue Using Circular Queue.

        public void display(){
            int i;
            for(i=F;i!=R;i=(i+1)%size){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {

        DEQueue d=new DEQueue();

        // Insertion at End(Rear)

// 		d.Enqueue_Rear(10);
// 		d.Enqueue_Rear(20);
// 		d.Enqueue_Rear(30);
// 		d.Enqueue_Rear(40);

        // Insertion at Begining(Front)

        d.Enqueue_Front(10);
        d.Enqueue_Front(20);
        d.Enqueue_Front(30);
        d.Enqueue_Front(40);

        System.out.println("The Elements in DEQueue is :");
        d.display();

        System.out.println();

        // Deletion at Begining(Front)

// 		System.out.println(d.DEQueue_Front()+" delete from DEQueue :");

        // Deletion at End(Rear)

        d.DEQueue_Rear();

        System.out.println("After the Elements in DEQueue is :");
        d.display();

    }

}
