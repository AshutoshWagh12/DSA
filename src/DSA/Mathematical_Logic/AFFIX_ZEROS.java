package DSA.Mathematical_Logic;

import java.util.Scanner;

public class AFFIX_ZEROS {

    public static void main(String []args){

        /*
               Given a pair of positive integers M and N

               Constraints:
               0 < M < 999
               1 < N <= 999

               write a program to smartly affix zeroes , while printing the numbers from M to N.

               Example 1.
               Input:
               5 10

               Expected output:
               05 06 07 08 09 10

               Input:
               9 100

               Expected output:
               009 010 011 012 ..... 098 099 100

               Input:
               1 9

               Expected output:
               1 2 3 4 5 6 7 8 9

         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the low number ");
        int low = sc.nextInt();

        System.out.println("Enter the high number ");
        int high = sc.nextInt();

        while(low<=high){
//            if(high>=1000){
//                System.out.printf(" %04d ",low);
//            }
            if(high>=100){
                System.out.printf(" %03d ",low);
            }
            else if(high>=10){
                System.out.printf(" %02d ",low);
            }
            else{
                System.out.printf(" %d ",low);
            }
            low++;
        }

    }
}
