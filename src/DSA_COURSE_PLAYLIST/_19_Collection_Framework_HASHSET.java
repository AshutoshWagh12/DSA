package DSA_COURSE_PLAYLIST;


// Collection FrameWork-->[HashSet]

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _19_Collection_Framework_HASHSET {

    public static void main(String[] args) {

        HashSet<Integer>h=new HashSet<>();
//	    HashSet<Integer>h=new LinkedHashSet<>();
        //  Ans-> As it is Print [88,56,21,94,64]

        h.add(88);
        h.add(56);
        h.add(21);  //     INDEX ->     0    1   2   3   4
        h.add(94);  // [21,88,56,94]   [21][88][56][94]
        h.add(64);  //[64,21,88,56,94] [64][21][88][56][94]


        System.out.println(h);
    }
}
