package DSA.Mathematical_Logic;

import java.util.Scanner;

public class SNAKE_PATTERN {

    public static void main(String [] args){

        /*
                1 -> 2 -> 3 -->
            <-- 4 <- 5 <- 6 <-|
            |-> 7 -> 8 -> 9

            Output = 1 2 3 6 5 4 7 8 9
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix length N x N :");
        int n = sc.nextInt();

        int [][]arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
//            else{
//                for(int j=0;j<n;j++){
//                    System.out.print(arr[i][j]+" ");
//                }
//            }
        }



    }

}
