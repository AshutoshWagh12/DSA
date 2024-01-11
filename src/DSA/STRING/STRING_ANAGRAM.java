package DSA.STRING;

import java.util.Arrays;
import java.util.Scanner;

public class STRING_ANAGRAM {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char x [] = s.toCharArray();
        char y [] = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        int found=0;

        for(int i=0;i<x.length;i++){
            if(x[i] != y[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

//        String s = "anagram", t = "nagaram";
//        String s = "rat", t = "car";
        String s = "aacc", t ="ccca";

        boolean result = isAnagram(s,t);
        System.out.println(result);


        /*

            Given two strings s and t, return true if t is an anagram of s, and false otherwise.

            An Anagram is a word or phrase formed by rearranging the letters of a different word
            or phrase, typically using all the original letters exactly once.

            Example 1:

            Input: s = "anagram", t = "nagaram"
            Output: true

            Example 2:

            Input: s = "rat", t = "car"
            Output: false

        */

    }

}
