package DSA.STRING;

import java.util.Scanner;

public class DNA_COMPLEMENT {

    public static String DNA_Complement(String word){

        StringBuilder complement = new StringBuilder();

        for(int i=word.length()-1;i>=0;i--){
            char res = word.charAt(i);

            switch (res) {
                case 'A':
                    complement.append('T');
                    break;
                case 'T':
                    complement.append('A');
                    break;
                case 'C':
                    complement.append('G');
                    break;
                case 'G':
                    complement.append('C');
                    break;
            }
        }

        return complement.toString();
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
//        String word ="ATCGTA";
        String word ="ACCGGGTTTT";

        String result = DNA_Complement(word);
        System.out.println(result);

        /*
        String s = "ACCGGGTTTT";
        reverse  = "TTTTGGGCCA";
        - A and T Complement each other.
        - C and G Complement each other.
        Output   = "AAAACCCGGT";
         */

    }

}
