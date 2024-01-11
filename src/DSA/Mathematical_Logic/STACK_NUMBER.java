package DSA.Mathematical_Logic;

import java.util.Scanner;
import java.util.Stack;

public class STACK_NUMBER {

    public static int Solution(int n){
//        Stack<Integer> s;
        Stack<Integer> s1 = new Stack<>();

        for(int i=9;i>=2;i--){
            while (n % i == 0) {
                s1.push(i);
                n = n/i;
            }
        }
        if(n != 1){
            return -1;
        }
        else{
            for(int i=0;i < s1.size();i++){
                if( !s1.empty()){
                    s1.pop();
                }
            }

        }
        return 0;
    }

    public static void main(String [] args){

        /*
            Write a program to find the smallest integer value b for a given value of a. If we multiply the
            digit of b, We should get exact value of a.

            Result b must contain more than one digit.

            Constraints :

            1 <= a <= 10000

            EXAMPLE 1:

            INPUT :
            10

            OUTPUT :
            25

            EXPLANATION :

            2 * 5 = 10

            EXAMPLE 2:

            INPUT :
            100

            OUTPUT :
            455

            EXPLANATION :

            4 * 5 * 5 = 100

            APPROACH :

            1] B is formed by digits which can completely divide A.
            2] Digit are from 0 to 9, but in this case we can't take 0 and 1 for forming number in B.
            3] We will run a loop from J=9 and i=2.
            4] For every I will divide A by it, until A can't be further divide by i.
            5] After every successful division we will push value of I into stack.
            6] If after end of loop our A = 1, then we will form a number from digit which are present in stack.
            7] If after end of loop out A != 1 then we will return -1 from function.

            DRY RUN :
                                                                                  |       |
            A = 100                                                               |       |
            i = 9,8,7,6 // is not divisible by 100                                |   4   |
            i = 5 // is divisible by 100, then push i=5 value in stack            |   5   |
            A = 20                                                                |   5   |
            i = 5 // is divisible by 100, then push i=5 value in stack            |_______|
            A = 4
            i = 5  // is not divisible by 100
            i = 4 // is divisible by 100, then push i=4 value in stack
            A = 1
             Now our loop is over, then pop-out elements in stack
            455


         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

//        Stack<Integer> s;
//        Stack<Integer> s1 = new Stack<>();

        Solution(n);


    }

}
