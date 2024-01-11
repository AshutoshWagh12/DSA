package DSA.Mathematical_Logic;

import java.util.Scanner;

public class Num_of_Words_Written_In_Line {

    /*
       ------   NUMBER OF WORDS WRITTEN ON GIVEN LINE ON A PAGE   ------

      Example :
      Consider the page that has been completed, like so;

      1] number
      2] sequences fun
      3] number sequences fun
      4] sequences fun number sequences fun
      5] number sequences fun sequences fun number sequences fun

      Here line contains 1 word, & second line contains 2 words. If the given input value of
      totalLines is 5, the program should print the number of words in line 5, which is 8.

      The Input and Output for this example would be as follows:
      Input
      1
      2
      5

      Output
      8

      Constraints:
            - The number of words in first and second lines should be at least 1.
            - Number of words in second line should be more than the no.of words
              in the first line.

      Example 02:
      Input :
      3
      1
      10

      Output:
      Invalid Input


     */

    static int findWordCount(int first,int second,int total){

        int i=1,Totalcount = 0;

        if(first < 1 || second < 1 || second <= first){
            System.out.println("Invalid Input");
        }
        else{
            while(i<total-1){
                Totalcount = first+second;
                first = second;
                second = Totalcount;
                i++;
            }
        }

        return Totalcount;
    }

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        int wordCountFirstLine, wordCountSecondLine, totalLines;

        System.out.println("Enter the first Line word : ");
        wordCountFirstLine = sc.nextInt();

        System.out.println("Enter the Second Line word : ");
        wordCountSecondLine = sc.nextInt();

        System.out.println("Enter the Total Line word : ");
        totalLines = sc.nextInt();

        int result = findWordCount(wordCountFirstLine,wordCountSecondLine,totalLines);
        System.out.println(result);



    }
}


