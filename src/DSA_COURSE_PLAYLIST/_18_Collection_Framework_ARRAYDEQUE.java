package DSA_COURSE_PLAYLIST;


// Collection FrameWork-->[ARRAYDEQUE]

import java.util.ArrayDeque;

public class _18_Collection_Framework_ARRAYDEQUE {

    public static void main(String[] args) {

        ArrayDeque<Integer>d=new ArrayDeque<>();

        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);        // [10,20,30,40]

// 		d.addFirst(500);  // [500,10,20,30,40]
// 		d.addLast(800);   // [10,20,30,40,800]

// 		System.out.println(d.getFirst()); // [10,20,30,40]->[10]
// 		System.out.println(d.getLast());  // [10,20,30,40]->[40]

        System.out.println(d);
    }
}
