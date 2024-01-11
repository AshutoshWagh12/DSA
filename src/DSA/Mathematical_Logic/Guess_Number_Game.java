package DSA.Mathematical_Logic;


import java.util.Scanner;
import java.util.Random;

class game{

    int user_ip;
    int comp_ip;
    int guess=0;   // To store Your Attempt initially set 0.

    // Create Constructor to take Random number

    public game(){
        Random rm=new Random();
        comp_ip=rm.nextInt(11);
    }

    // Create takeinput() Method and take user input

    public void takeinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        user_ip=sc.nextInt();
    }

    // To check the user guess no.is true or false

    public boolean iscorrect(){
        guess++;
        if(user_ip==comp_ip){
            System.out.println("Awessome  !!! Your Guess Number is Correct !!!");
            System.out.println("The Total attempt is :"+guess);
            return true;
        }
        else if(user_ip>comp_ip){
            System.out.println(" Your Number Greater !!! \n Try Again !!!");
        }
        else if (user_ip<comp_ip){
            System.out.println(" Your Number less !!! \n Try Again !!!");
        }
        return false;
    }
}

public class Guess_Number_Game {

    public static void main(String[] args) {
        System.out.println("Guess Number Game !!!");

        System.out.println("Please Enter the number between 1 to 10 :");

        // Create an object of game class

        game g=new game();

	  /*If the condition true then fine but condition false
		the create loop and again check whether
		the given guess number is true or false  */

        boolean b=false;
        while(!b){
            g.takeinput();
            b=g.iscorrect();

        }
        System.out.println("Thank You For Playing Game  !!!!");

    }

}

