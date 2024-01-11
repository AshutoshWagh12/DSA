package DSA.STRING;

import java.util.Scanner;

public class KEYWORD_CHECK {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String arr[] = {"break","case","continue","defer","default","else","for","func","gate","if",
                "map","range","return","struct","type","var"};

        System.out.println("Enter the sentence !!!");
        String s = sc.nextLine();

        int flag = 0; // not a keyword

        for(int i=0;i<arr.length;i++){
            if(arr[i] == s){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(s+" is a keyword");
        }
        else{
            System.out.println(s+" is a keyword");
        }

    }

}
