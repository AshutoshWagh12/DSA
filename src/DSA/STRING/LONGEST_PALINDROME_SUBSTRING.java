package DSA.STRING;

import java.util.Scanner;

public class LONGEST_PALINDROME_SUBSTRING {

    public static String longestPalindrome(String s) {

        int start=0,end=0;

        for(int i=0;i<s.length();i++){
            int len1=expandFromCenter(i,i+1,s);
            int len2=expandFromCenter(i,i,s);
            int len = Math.max(len1,len2);
            if(end-start<len){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int expandFromCenter(int i,int j, String s){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s = "adckbaabmnop";

        String res = longestPalindrome(s);
        System.out.println(res);


        /*

        Example 1:

        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.
        Example 2:

        Input: s = "cbbd"
        Output: "bb"


         a c d c a       2]    b  a a  b
             |                    | |
             ij                   i j


         */

    }

}
