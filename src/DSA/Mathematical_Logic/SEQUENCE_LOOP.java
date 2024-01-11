package DSA.Mathematical_Logic;

import java.util.Scanner;

public class SEQUENCE_LOOP {

    /*
    INPUT
        2
        0 2 10
        5 3 5
    Output
        2 6 14 30 62 126 254 510 1022 2046
        8 14 26 50 98

    Explanation:

            a=0 , b=2, n=10
            0 + 1*b + 2*b + 4*b + 8*b + 16*b + 32*b....
    */

    public static void result(int a,int b,int n){
        int seq=1,sum=0;
        while(n!=0){
            sum += ((seq)*b);
            System.out.print((a+sum)+ " ");
            seq *= 2;
            n -=1;
        }
        System.out.println();
    }

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b=0,n=0;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            result(a,b,n);
        }
        in.close();


    }

}
