package DSA.Mathematical_Logic;

import java.util.Scanner;

public class TABLE {

    public static void Table(int n){
        for(int i=1;i<=n;i++){
            System.out.printf(" %03d ",i);
        }
        System.out.println();

        int row = 2;
        while (row<=n) {
            for (int i = 1; i <= n; i++) {
                System.out.printf(" %03d ",(i * row));
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want table upto n number");
        int n = sc.nextInt();

        Table(n);

    }

}
