package DSA.STRING;

import java.util.Scanner;

public class STRING_PALINDROME {

    public static boolean isPalindrome(String sentence) {

        String Modify_Sentence = sentence.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int size = Modify_Sentence.length();

        String New_Sentence = "";

        for(int i=size-1;i>=0;i--){
            New_Sentence += Modify_Sentence.charAt(i);
        }

        int Yes=0, No=0;

        for(int i=0;i<size;i++){
            char a = Modify_Sentence.charAt(i);
            char b = New_Sentence.charAt(i);
            if(a == b){
                Yes ++;
            }
            else {
                No ++;
            }
        }
        if(No != 0){
            return false;
        }
        else{
            return true;
        }

    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

//        String sentence ="A man, a plan, a canal: Panama";
        String sentence = "race a car";

        boolean result = isPalindrome(sentence);
        System.out.println(result);


        /*

            Example 1:

            Input: s = "A man, a plan, a canal: Panama"
            Output: true
            Explanation: "amanaplanacanalpanama" is a palindrome.

            Example 2:

            Input: s = "race a car"
            Output: false
            Explanation: "raceacar" is not a palindrome.

         */

    }

}
