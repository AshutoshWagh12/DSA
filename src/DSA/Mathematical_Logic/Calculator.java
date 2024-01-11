package DSA.Mathematical_Logic;


import java.util.*;

// Create costome Exception :-User Cannot Enter valid InputException

class InvalidInputException extends Exception{

    public String toString(){
        return " Please Enter Valid Input only +,-,* & /....";
    }
}

// Create Costome Exception :-Maximum user take Input is 100

class MaxInputException extends Exception{

    public String toString(){
        return " Input can't be greater than 100 !!!";
    }
}

// Create Costome Exception :-2 No.Max.multi.is under 1000

class MaxMultiException extends Exception{

    public String toString(){
        return " Multiplication only under 1000 !!!";
    }
}

// Create Costome Exception :- can not divide by 0

class cannotDivide0Exception extends Exception{

    public String toString(){
        return " You can not divide by 0 !!!";
    }
}

public class Calculator {

    // Create a Method for 2 No.Of Max.Multi.is under 1000(Exception)

    static double Multi(double a,double b)throws MaxMultiException{
        double c=a*b;
        if(c>1000){
            throw new MaxMultiException();
        }
        return c;
    }

    // Create a Method for Can not divide by 0 (Exception)

    static double divide(double a,double b)throws cannotDivide0Exception{
        if(b==0){
            throw new cannotDivide0Exception();
        }
        return a/b;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st Number :");
        int a=sc.nextInt();

        System.out.println("Enter the Operator :");
        String op=sc.next();

        System.out.println("Enter the 2nd Number :");
        int b=sc.nextInt();

        try{
            if(a>100 || b>100){
                throw new MaxInputException();
            }
            switch(op){
                case "+":
                    System.out.println("The sum = "+(a+b));
                    break;
                case "-":
                    System.out.println("The sub = "+(a-b));
                    break;
                case "/":
                    System.out.println("The division = "+divide(a,b));
                    break;
                case "*":
                    System.out.println("The Multi = "+Multi(a,b));
                    break;
                default :
                    throw new InvalidInputException();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
