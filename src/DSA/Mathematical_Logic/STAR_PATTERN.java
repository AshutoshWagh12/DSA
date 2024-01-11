package DSA.Mathematical_Logic;

import java.util.Scanner;

public class STAR_PATTERN {

    /*

        [1]

        *
        *  *
        *  *  *
        *  *  *  *

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        [2]

        *  *  *  *  *
        *  *  *  *
        *  *  *
        *  *
        *

        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }


        [3]

                    *
                 *  *
              *  *  *
           *  *  *  *
        *  *  *  *  *

        for(int i=1;i<=4;i++){
            for(int j=i;j<4;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        [4]

        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *
        *  *
        *

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

        [5]

                 *
              *  *
           *  *  *
        *  *  *  *
           *  *  *
              *  *
                 *

        for(int i=1;i<=4;i++){
            for(int j=i;j<4;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int k=3;k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }


        [6]

        *  *  *  *  *
        *           *
        *           *
        *  *  *  *  *


        for(int i=1;i<=3;i++) {
            if(i==1 || i==3){
                for (int j = 1; j <= 4; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            else if(i==2){
                for(int x=2;x<4;x++){
                    for(int j=x;j<=x;j++){
                        System.out.print(" * ");
                    }
                    for(int k=2;k<4;k++){
                        System.out.print("   ");
                    }
                    for(int m=x;m<=x;m++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }
        }

         */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



    }

}
