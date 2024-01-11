package DSA_COURSE_PLAYLIST;


// Collection FrameWork-->[LINKEDLIST]

import java.util.LinkedList;


public class _14_Collection_Framework_LINKEDLIST {

    public static void main(String[] args) {

        LinkedList<Integer>l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();

        l2.add(100);
        l2.add(500);
        l2.add(800);

        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);

// 		l1.add(4);

//      l1.remove(1);      // [2 6 8] Remove Element at index 1.

// 		l1.add(1,10);      // [2 10,4,6,8]

// 		l1.set(1,20);      // [2 20 6 8]

//      l1.addLast(2000);  // [2 4 6 8 2000]
//   	l1.addFirst(5000); // [5000 2 4 6 8]

// 		System.out.println(l1.getLast());    // [8]->l1
// 		System.out.println(l1.getFirst());   // [2]->l1

// 		System.out.println(l1.contains(6));  // Check NO.is present or Not

// 		System.out.println(l1.indexOf(4));   //[2,4,6,8 4]->1st No.Index is Display

//      System.out.println(l1.lastIndexOf(4));  //[2,4,6,8 4]->last No.Index is Display

//	    l1.addAll(l2);        // l2 is Add in last of l1.

//      l1.addAll(0,l2);      // l2 is Add in First of l1.

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }


    }
}
