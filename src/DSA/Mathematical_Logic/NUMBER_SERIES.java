package DSA.Mathematical_Logic;

import java.util.Scanner;

public class NUMBER_SERIES {

    public static void main(String []args){

        //  1 , 1 , 2 , 3 , 4 , 9 , 8 , 27 , 16 , 81 , 32 .........
        /* This series is a mixture of 2 series - all the odd terms in this series form of geometric
           series & all the even terms in this series form yet geometric series. Write a program to find
           the Nth term in the series.
        */

/*  Index       1   2   3   4   5   6   7   8   9   10   11
              | 1 | 1 | 2 | 3 | 4 | 9 | 8 | 27| 16| 81 | 32 |
                 \_____/
                   x 2
                     \_____/
                       x 3
 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int a=0;
        int b=0;

        for(int i = 1; i<=n; i++) {

            if(i % 2 != 0 ) {
                if (i == 1) {
                    a = 1;
                } else {
                    a = a * 2;
                }
            }
            else{
                if(i==2){
                    b = 1;
                }
                else{
                    b = b * 3;
                }
            }
        }
        if(n % 2 != 0){
            System.out.println(n+" term of series is : "+ a);
        }
        else{
            System.out.println(n+" term of series is : "+ b);
        }
    }

}
