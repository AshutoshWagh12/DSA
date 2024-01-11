package DSA.STRING;

import java.util.Scanner;
import java.util.Stack;

public class PARENTHESIS_MATCH {

    public static boolean match(char a,char b){
        if(a=='('&& b==')' || a=='{'&& b=='}' || a=='['&& b==']'){
            return true;    // paranthesis is Match
        }
        return false;       // paranthesis is Not Match
    }

    public static boolean isValid(String expression) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty() || !match(stack.pop(), character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }


    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        String s = "{((10+2)*[6/2])}";

        boolean result = isValid(s);
        System.out.println(result);

        /*

            Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
            determine if the input string is valid.

            An input string is valid if:

            Open brackets must be closed by the same type of brackets.
            Open brackets must be closed in the correct order.
            Every close bracket has a corresponding open bracket of the same type.


            Example 1:

            Input: s = "()"
            Output: true
            Example 2:

            Input: s = "()[]{}"
            Output: true
            Example 3:

            Input: s = "(]"
            Output: false


         */

    }

}
