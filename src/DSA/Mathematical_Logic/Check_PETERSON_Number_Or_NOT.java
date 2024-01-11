package DSA.Mathematical_Logic;


import java.util.*;

public class Check_PETERSON_Number_Or_NOT {

    public static void main(String[] args) {


        // To Check Given No.is Peterson Or Not.

	/*

	        145 is Peterson No.Or Not

	        145  =  1! + 4! + 5! == 145

	        Result == Result [ 'YES'- It is Peterson Number]

	        Result != Result [ 'NO'- It is Not Peterson Number]


	*/


        Scanner sc=new Scanner(System.in);

        int n,n1,Reminder,Result=0;
        System.out.println("Enter the number :");
        n=sc.nextInt();

        n1=n;

        while(n!=0){
            Reminder=n%10;

            int Factorial=1;
            for(int i=1;i<=Reminder;i++){
                Factorial*=i;
            }

            Result+=Factorial;
            n/=10;
        }

        System.out.println("The Result is :"+Result);

        if(Result==n1){
            System.out.println(n1+" is Peterson Number !!");
        }
        else{
            System.out.println(n1+" is Not Peterson Number !!");
        }

    }
}
