package DSA.Mathematical_Logic;


import java.util.*;

public class Check_SUNNY_Number_Or_NOT {

    public static boolean Perfect_Square(int n){
        double Square_Root=Math.sqrt(n);
        return (n % Square_Root==0);
    }

    public static void checkNumber(int n){
        if(Perfect_Square(n+1)){
            System.out.println(n+" is SUNNY Number !!");
        }
        else{
            System.out.println(n+" is Not SUNNY Number !!");
        }
    }

    public static void main(String[] args) {

        // To Check Given No.is SUNNY Number Or Not

        /*

            80  is SUNNY Number Or Not

            80 = (80+1)  == 81   //   N=(N+1)

            81 is Perfect Square of 9
            ['YES' - It is SUNNY Number]

        */

        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the Number :");
        n=sc.nextInt();

        /*

         double Square_Root=Math.sqrt(n+1);

         System.out.println("Square_Root = "+Square_Root);

         if((n+1)%Square_Root==0){
             System.out.println(n+" is SUNNY Number !!");
         }
         else{
             System.out.println(n+" is Not SUNNY Number !!");
         }

        */

        checkNumber(n);

    }
}
