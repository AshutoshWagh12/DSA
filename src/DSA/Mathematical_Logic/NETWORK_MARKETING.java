package DSA.Mathematical_Logic;

import java.util.Scanner;

public class NETWORK_MARKETING {

    public static void main(String [] args){

        /*
            In network marketing a person who sells some merchandise becomes the root node of a so-called
            network marketing tree. When the first person inducts someone into the network marketing tree
            the first person becomes the supervisor. Likewise, if this new recruit inducts a third person
            into the network marketing tree the new recruit becomes supervisor of the third person. The
            tree grows so on and so forth.

                                    ____
                                   /  A \
                                   \____/
                                            ____
                                           /  B \
                                           \____/
                                                    ____
                                                   /  C \
                                                   \____/


             Whenever anybody in the network marketing tree makes a profit, they have to pass a certain percentage
             of that profit to their supervisor. The percentage of the profit passed to the superior will be
             rounded to the nearest integer, and hence will always be an integer at each level. Calculate the profit
             of the person at the root of the network marketing tree coming from a particular individual at Nth
             level in the tree.

             Constraints :

             1 < N < 20
             0 < M < 10^8
             0 < P <= 50

             INPUT :

             The input has three lines, each with one integer.

             The first line contains an integer N, which determine the height of the network marketing tree.
             The second line contains an integer M, which denotes the profit earned by a particular individual
             at Nth level.
             The Third line contains an integer P, which denotes profit % that needs to be passed on to
             supervisor. Each supervisor will always get an integer amount of the profit (rounded to the nearest
             integer) from his subordinate.

             OUTPUT:

             The profit earned by the person at the root of the network marketing tree coming from a particular
             individual at Nth level in the tree, rounded off to the nearest integer.

             EXAMPLE 1:

             3
             100
             10

             Output:
             1

             EXPLANATION :

             We are given N = 3, M = 100 and P = 10
             The person is at 3rd level of hierarchy earned 100 as profit.
             The person at 2ne level will get P % of the profit of person at 3rd level.
             Which is 10 % of 100 = 10.
             The person at 1st level(root) will earn P % of profit of person at 2nd level.
             Which is 10 % of 10 = 1.
             So, the output is 1.

             Example 2:

             Input :
             4
             2000
             50

             Output:
             250

         */

        Scanner sc = new Scanner(System.in);

        int N , M , P;

        System.out.println("Enter the N height of the network marketing tree.");
        N = sc.nextInt();

        System.out.println("Enter the profit earned by a particular individual at Nth level.");
        M = sc.nextInt();

        System.out.println("Enter the profit % that needs to be passed on to supervisor.");
        P = sc.nextInt();

        int i = 0;
        while(i < N-1){   // (N-1)   means If No.of Nodes present 3 then no.of calculations done 2
            M = (P*M)/100;
            i++;
        }
        System.out.println("The profit earned by the person at the root of the network marketing tree is : "+M);

    }

}
