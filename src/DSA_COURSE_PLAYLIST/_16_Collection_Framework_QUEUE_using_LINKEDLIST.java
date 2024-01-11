package DSA_COURSE_PLAYLIST;


// Collection FrameWork-->[QUEUE Using LINKEDLIST]

import java.util.Queue;
import java.util.LinkedList;

public class _16_Collection_Framework_QUEUE_using_LINKEDLIST {

    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);   // [10,20,30,40]

        System.out.println(q.peek()); // [10]

        q.poll();   // Delete at Front->[20,30,40]

        System.out.println(q);

    }
}
