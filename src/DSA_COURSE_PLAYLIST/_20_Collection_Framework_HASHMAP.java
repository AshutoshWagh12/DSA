package DSA_COURSE_PLAYLIST;


// Collection FrameWork-->[HashMap]

import java.util.HashMap;
import java.util.Map;

public class _20_Collection_Framework_HASHMAP {

    public static void main(String[] args) {

        HashMap<Integer,String>h=new HashMap<>();

        h.put(10,"Ashutosh");
        h.put(4,"Rushi");   //        <-INDEX->
        h.put(20,"Sanket");//   0        1        2       3
        h.put(6,"Ram");  // [4=Rushi,20=Sanket,6=Ram,10=Ashutosh]
        //  4%4=0    20%4=0    6%4=2   10%4=2
        // 20%4=0 & 10%4=2  But index 0 & index 2 is Already Full shift on next Index

        // h.remove(20);

        System.out.println(h);

	    /*

	    // Print only Integers Key

	    for(Integer k:h.keySet()){
	        System.out.print(k+",");
	    }
	    System.out.println();

	    // Print only String values

	    for(String k:h.values()){
	       System.out.print(k+",");
	    }

	    */

    }
}
