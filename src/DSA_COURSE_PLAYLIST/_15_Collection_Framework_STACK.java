package DSA_COURSE_PLAYLIST;


// Collection FrameWork->[STACK]

import java.util.Scanner;
import java.util.Stack;


public class _15_Collection_Framework_STACK {

    public static void main(String[] args) {

        Stack<Integer>s=new Stack<>();

        Scanner sc=new Scanner(System.in);

        // Taking User I/P

        for(int i=0;i<4;i++){
            System.out.println("Enter the Element You Want to push :");
            int n=sc.nextInt();
            s.push(n);
        }

// 		s.push(10);
// 		s.push(20);
// 		s.push(30);
// 		s.push(40);

// 		s.pop();   // [10,20,30] pop[Delete] TopMost Element in stack

// 		System.out.println(s.peek()); // [40] Peek[Display] TopMost Element in stack

// 		System.out.println(s.search(30)); // [2] Position in stack

        System.out.println(s);
    }
}
