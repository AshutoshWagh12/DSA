package DSA.Mathematical_Logic;

import java.util.Scanner;

public class REPLACE_NUMBER {

    public static void main(String [] args){

        /*
            QUESTION -
                    A game development company wants to design a brain game application for kids.
            There are different types of tasks to be designed for the game. Among all the tasks,
            there is one task in which each digit of an existing number has to be replaced with
            another digit. Consider the following table:

            Existing Numbers:- 123456789
            Replace by      :- 987654321

            Input  : An Integer N.
            Output : An integer with replace values.

            Constraints:
                1] 0 <= N <= 1000000.
                2] If N value is out of above range print ("Wrong Input").

            INPUT -
            1] 105671
            2] 1000001

            OUTPUT -
            1] 894328
            2] Wrong Input

            Explanation -
              1     0     5     6     7     1
            (9-1) (9-0) (9-5) (9-6) (9-7) (9-1)
              8     9     4     3     2     8

         */



        Scanner sc = new Scanner(System.in);

        int n,reminder,result=0;

        System.out.println("Enter the number :");
        n = sc.nextInt();

        if(n < 0 || n > 1000000){
            System.out.println("Wrong Input !!");
        }
        else{
            while(n!=0){
                reminder = n % 10;
                result = (result*10)+(9-reminder);
                n /= 10;
            }

            int original = 0;
            while(result != 0){
                reminder = result % 10;
                original = (original*10)+reminder;
                result /= 10;
            }
            System.out.println(original);
        }

    }

}
