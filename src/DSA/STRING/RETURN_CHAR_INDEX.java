package DSA.STRING;

import java.util.Scanner;

public class RETURN_CHAR_INDEX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        take input string and character

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine().toLowerCase();

        System.out.print("Enter a character: ");
        char charString = sc.nextLine().toLowerCase().charAt(0);


//       int charIndex = inputString.indexOf(charString);


        int charIndex = -1;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charString) {
                charIndex = i;
                break;
            }
        }

        if (charIndex != -1) {
            System.out.println("Character found at index : " + charIndex);
        } else {
            System.out.println("Not found");
        }

    }

}
