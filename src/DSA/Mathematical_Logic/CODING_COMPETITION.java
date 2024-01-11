package DSA.Mathematical_Logic;

import java.util.Scanner;

public class CODING_COMPETITION {

    public static void Result (int P1,int P2,int P3,int Q,int Total_Employees,int R){

        int Second_Answer = (Total_Employees - R) - P1 - P2 - P3 + 2*Q;
        int X = (Second_Answer/3);

        int first_Answer = X + (P1-Q) + Q + (P3-Q) ;

        System.out.println(first_Answer);
        System.out.println(Second_Answer);

    }

    public static void main(String [] args){

        /*
            A coding competition was conducted in company with e employees. Data of employees who
            participated & who did not participate in the competition is available. There were
            three problems in the coding competition. Data as mentioned below is available.

            The number of employee who have solved only the first, only the second and only the
            third problem are equal.

            P1 employees who solved the first , second problem.
            P2 employees who solved the second , third problem.
            P3 employees who solved the third , first problem.
            Q employees who solved all the 3 problems.
            R employees who did not participate in competition.

            Answer the following questions based on data.

            1] How many employees have solved the first problem ?
            2] How many employees have solved exactly one of the 3 problems?

            Example:

            Input
            30    -> P1
            26    -> P2
            28    -> P3
            14    -> Q
            345   -> E (Total Employees)
            43    -> R (Who did not participate)

            Output:
            126
            246

            _____________ _____________
      Q1   /            /\             \ Q2
          /  X         /P1\        X    \
         /         ___/____\___          \
         \        /   \  Q /   \         /
          \      / P3  \  /  P2 \       /
           \____/_______\/_______\_____/
                \                /
                 \      X       /
                  \____________/
                        Q3
                                                    =    3X + P1 - Q + P2 - Q + P3 - Q + Q = Total_Employees - R
                                                    =    3X + P1 + P2 + P3 - 2Q = 302
                                                    =    3X = (Total_Employees - R) - P1 - P2 - P3 + 2Q
                                                    =    3X = (345 - 43) - P1 - P2 - P3 + 2Q
            ______________ ______________           =    3X = 302 - P1 - P2 - P3 + 2Q
      Q1   /            /  \             \ Q2       =    3X = 302 - 30 - 26 - 28 + 2(14)->28
          /  X         /p1-Q\        X    \         =    3X = 302 - 56
         /        ____/______\___          \        =    3X = 246   -> 2nd Question Answer
         \       /    \  Q   /   \         /        =     X = 82
          \     / P3-Q \    / P2-Q\       /
           \___/________\__/_______\_____/          =    X + (P1-Q) + Q + (P3-Q)
               \                   /                =    82 +  16 + 14 + 14
                \         X       /                 =    126   -> 1st Question Answer
                 \_______________/
                        Q3

         */


        Scanner sc = new Scanner(System.in);

        int P1, P2, P3, Q, Total_Employees, R;

        System.out.println("Enter the P1 employees who solved the first, second problem.");
        P1 = sc.nextInt();

        System.out.println("Enter the P2 employees who solved the second , third problem.");
        P2 = sc.nextInt();

        System.out.println("Enter the P3 employees who solved the third , first problem.");
        P3 = sc.nextInt();

        System.out.println("Enter the Q employees who solved all the 3 problems.");
        Q = sc.nextInt();

        System.out.println("Enter the Total employees !!!");
        Total_Employees = sc.nextInt();

        System.out.println("Enter the R employees who did not participate in competition");
        R = sc.nextInt();

        Result(P1,P2,P3,Q,Total_Employees,R);


    }

}
