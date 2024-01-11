package DSA_COURSE_PLAYLIST;


import java.util.Stack;

public class _08_Infix_To_Postfix {

    private static final int size = 100;

    public static class CustomStack {

        char[] arr = new char[size];
        int top = -1;

        // create isEmpty function

        public boolean isEmpty() {
            return top == -1;
        }

        // Create function StackTop

        public char stackTop() {
            return arr[top];
        }

        // push function

        public void push(char value) {
            if (top == (size - 1)) {
                System.out.println("Stack Overflow!!");
            } else {
                top++;
                arr[top] = value;
            }
        }

        // pop function

        public char pop() {
            if (top == -1) {
                System.out.println("Stack Underflow!!");
                return 1;
            } else {
                char value = arr[top];
                top--;
                return value;
            }
        }
    }

    // Create precedence function

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    // Create function operators

    private static boolean isOperator(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    public static String infixToPostfix(String infix) {
        CustomStack stack = new CustomStack();

        StringBuilder postfix = new StringBuilder();

        char symbol;

        for (int i = 0; i < infix.length(); i++) {
            symbol = infix.charAt(i);

            if (symbol == '(' || precedence(symbol) > precedence(stack.stackTop())) {
                stack.push(symbol);
            }
            if (!isOperator(symbol)) {
                postfix.append(stack.pop());
            }
            if (precedence(symbol) < precedence(stack.stackTop())) {
                postfix.append(stack.pop());
            } else if (symbol == ')') {
                if (!stack.isEmpty()) {
                    postfix.append(stack.pop());
                }
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "a*b";

        System.out.println("Infix = " + infix);
        System.out.println("Postfix = " + infixToPostfix(infix));
    }
}


