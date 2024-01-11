package DSA_COURSE_PLAYLIST;


// Collection FrameWork-->[QUEUE in PriorityQueue]

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class _17_Collection_Framework_QUEUE_In_Priority_QUEUE {

    public static void main(String[] args) {

        Queue<Integer>p=new PriorityQueue<>();

// 		Queue<Integer>p=new PriorityQueue<>(Comparator.reverseOrder());
        // Ans--> [100,80,60,40]

        p.offer(80);
        p.offer(40);
        p.offer(60);
// 		p.offer(30);   // [30,40,60,80,100]
        p.offer(100);  // [40,80,60,100]

// 		p.poll();  // [60,80,100]

        System.out.println(p);

    }
}
