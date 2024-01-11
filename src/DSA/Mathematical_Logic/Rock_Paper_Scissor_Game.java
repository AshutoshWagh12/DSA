package DSA.Mathematical_Logic;

import java.util.*;
public class Rock_Paper_Scissor_Game {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int win=0,loss=0,count=0;
        int i=0;
        while(i<3){

            System.out.println("Enter the User_ip :");
            int User_ip=sc.nextInt();

            switch(User_ip){
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissor");
                    break;
            }

            Random rm=new Random();
            int Comp_ip=rm.nextInt(3);

            switch(Comp_ip){
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissor");
                    break;
            }

            count++;
            if(User_ip==Comp_ip){
                System.out.println("Match Tied !!!!");

            }
            else if((User_ip==1&&Comp_ip==0)||(User_ip==0&&Comp_ip==2)||(User_ip==2&&Comp_ip==1)){
                System.out.println("Congratulation !!! You Won The Match !!!");
                win++;
            }
            else{
                System.out.println("Sorry !!! Computer Won The Match !!!");
                loss++;
            }

            System.out.println("You Won Matches = "+win);
            System.out.println("Computer Won Matches = "+loss);
            System.out.println("The Total Matches is :"+count);
            i++;
        }
        if(win>loss){
            System.out.println("Won !!! Won !!! Won !!! ");
        }
        else{
            System.out.println("Loss !!! Loss !!! Loss !!! ");
        }
    }
}
