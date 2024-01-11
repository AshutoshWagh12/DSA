package DSA.STRING;

import java.util.Arrays;
import java.util.Scanner;

public class CHECK_ADJACENT_CHAR_EQUAL {

    public static String minimalOperations(String words[]){

        int op[]=new int[words.length];

        for(int i=0;i< words.length;i++){
            for(int j=0;j<words[i].length()-1;j++){

                char c=words[i].charAt(j);
                char d=words[i].charAt(j+1);

                if(c==d){
                    op[i] = 1;
                    break;
                }
                else if(j == words[i].length()-2){
                    op[i]=0;
                }
            }

        }

        return Arrays.toString(op);

    }


    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        String words[] = {"ab","aab","abb","abab","abaaaba"};
//        String words[] = {"add","boook","break"};

        String result = minimalOperations(words);
        System.out.println(result);

        /*

        For each word in a list of words, if any two adjacent characters are equal,
        change one of them.

        Example:
        words = ["ab","aab","abb","abab","abaaaba"]
        Output = [0,1,1,0,1]


        words = ["add","boook","break"];

        1. "add" : change one d (print 1)
        2. "boook" : change one 0 (print 1)
        3. "break" : No changes are necessary (print 0)

        then return array is [1,1,0]

         */

    }

}
